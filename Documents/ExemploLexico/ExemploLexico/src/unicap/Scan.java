package unicap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import exceptions.EOFException;

public class Scan {

	private FileInputStream fis;
	private InputStreamReader isr;
	private PushbackReader pbr;

	public Scan(String path) throws FileNotFoundException {

		this.fis = new FileInputStream(path);
		this.isr = new InputStreamReader(this.fis);
		this.pbr = new PushbackReader(this.isr);
	}

	public Character obterCaracter() throws IOException {

		Character c = null;
		int i = this.pbr.read();

		if (i != -1) {
			c = (char) i;
		}
		return c;
	}

	public void devolverCaracter(Character c) throws IOException {

		this.pbr.unread(c);
	}

	public Token getToken() throws IOException, EOFException {

		Token token = null;
		Character c;

		do {
			String lexema = new String();
			c = this.obterCaracter();

			if (c == null) {
				throw new EOFException();
			}

			if (Character.isLetter(c) || c.equals('_')) {
				lexema = lexema + c;
				c = this.obterCaracter();
				while (Character.isLetter(c) || Character.isDigit(c)
						|| c.equals('_')) {
					lexema = lexema + c;
					c = this.obterCaracter();
				}
				this.devolverCaracter(c);
				token = new Token(lexema);
				ScanUtil.lookUp(token);
				break;
			}
			// ...
			if (Character.isDigit(c)) {
				lexema = lexema + c;
				c = this.obterCaracter();
				while (Character.isDigit(c)) {
					lexema = lexema + c;
					c = this.obterCaracter();
				}
				this.devolverCaracter(c);
				token = new Token(ScanUtil.NUMERO_INTEIRO, lexema);
				break;
			}
			
			if (c.equals(';')) {
				token = new Token(ScanUtil.PONTO_VIRGULA, c.toString());
				break;
			}
                        if (c.equals(')')) {
				token = new Token(ScanUtil.FECHA_PARENTESES, c.toString());
				break;
			}
                        if (c.equals('(')) {
				token = new Token(ScanUtil.ABRE_PARENTESES, c.toString());
				break;
			}
                        if (c.equals(':')||c.equals(',')||c.equals('.')) {
				token = new Token(ScanUtil.OPERADOR, c.toString());
				break;
			}if (c.equals('{')) {
				token = new Token(ScanUtil.ABRE_CHAVE, c.toString());
				break;
			}if (c.equals('}')) {
				token = new Token(ScanUtil.FECHA_CHAVE, c.toString());
				break;
			}if (c.equals('\n')||c.equals('\t')||c.equals('\r')||c.equals('\f')) {
				token = new Token(ScanUtil.ESPAÇO_BRANCO, c.toString());
				break;
			}
                        if (c.equals('*')||c.equals('/')||c.equals('=')||c.equals('-')) {
                            lexema=lexema+c;
                            c=this.obterCaracter();
                            while (c.equals('=')) {
					lexema = lexema + c;
					c = this.obterCaracter();
                                        
				}
				this.devolverCaracter(c);
                                if(lexema.equals("==")){
				token = new Token(ScanUtil.OPERADOR_LOGICO, lexema.toString());
				break;
                                }else{
                                   token = new Token(ScanUtil.OPERADOR_ARITMETICO, c.toString()); 
                                   break;
                                }
			}
                        if (c.equals('<')||c.equals('>')){
                            lexema=lexema+c;
                            c=this.obterCaracter();
                            while (c.equals('-')) {
					lexema = lexema + c;
					c = this.obterCaracter();
                                        
				}
				this.devolverCaracter(c);
                                if(lexema.equals("<-")){
				token = new Token(ScanUtil.OPERADOR_ATRIBUICAO, lexema.toString());
				break;
                                }else{
                                   token = new Token(ScanUtil.OPERADOR_LOGICO, c.toString()); 
                                   break;
                                }
				
			}
                        
		} while (Character.isSpace(c));

		return token;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public InputStreamReader getIsr() {
		return isr;
	}

	public void setIsr(InputStreamReader isr) {
		this.isr = isr;
	}

	public PushbackReader getPbr() {
		return pbr;
	}

	public void setPbr(PushbackReader pbr) {
		this.pbr = pbr;
	}

}
