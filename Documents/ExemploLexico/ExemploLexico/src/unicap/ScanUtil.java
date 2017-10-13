package unicap;

public class ScanUtil {

	public static final String PALAVRA_RESERVADA = "PALAVRA_RESERVADA";
        public static final String CONSTANTE_BOOLEANA = "CONSTANTE_BOOLEANA";
        public static final String OPERADOR_ATRIBUICAO = "OPERADOR_ATRIBUICAO";
        public static final String IDENTIFICADOR_TIPO = "IDENTIFICADOR_TIPO";
	public static final String ABRE_PARENTESES = "ABRE_PARENTESES";
        public static final String FECHA_PARENTESES = "FECHA_PARENTESES";
        public static final String ABRE_CHAVE = "ABRE_CHAVE";
        public static final String FECHA_CHAVE = "FECHA_CHAVE";
	public static final String ID = "IDENTIFICADOR";
	public static final String PONTO_VIRGULA = "PONTO_VIRGULA";
	public static final String NUMERO_INTEIRO = "NUMERO_INTEIRO";
        public static final String OPERADOR_LOGICO="OPERADOR_LOGICO";
        public static final String OPERADOR_ARITMETICO="OPERADOR_ARITMETICO";
        public static final String OPERADOR="OPERADOR";
        public static final String ESPAÇO_BRANCO="ESPAÇO_EM_BRANCO";

	public static void lookUp(Token token) {

		if (token.getLexema().equalsIgnoreCase("case")) {
			token.setCodigo(PALAVRA_RESERVADA);
		} else if (token.getLexema().equalsIgnoreCase("class")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equalsIgnoreCase("substr")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equalsIgnoreCase("concat")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equalsIgnoreCase("esac")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equals("Bool")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equals("isNil")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equalsIgnoreCase("init")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equalsIgnoreCase("else")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if(token.getLexema().equalsIgnoreCase("(")){
                    token.setCodigo(ABRE_PARENTESES);
                }else if(token.getLexema().equalsIgnoreCase(")")){
                    token.setCodigo(FECHA_PARENTESES);
                }else if (token.getLexema().equals("FALSE")) {
			token.setCodigo(PALAVRA_RESERVADA);
		} else if (token.getLexema().equals("TRUE")) {
			token.setCodigo(PALAVRA_RESERVADA);
		}else if (token.getLexema().equals("false")) {
			token.setCodigo(CONSTANTE_BOOLEANA);
		} else if (token.getLexema().equals("True")) {
			token.setCodigo(CONSTANTE_BOOLEANA);
		}else if (token.getLexema().equalsIgnoreCase("fi")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("if")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("in")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("inherits")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("isvoid")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("let")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("loop")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("new")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("not")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("of")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("pool")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("then")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("while")){
                        token.setCodigo(PALAVRA_RESERVADA);
                }else if (token.getLexema().equalsIgnoreCase("<")){
                        token.setCodigo(OPERADOR_LOGICO);
                }else if (token.getLexema().equalsIgnoreCase(">")){
                        token.setCodigo(OPERADOR_LOGICO);
                }else if (token.getLexema().equalsIgnoreCase(",")){
                        token.setCodigo(OPERADOR);
                }else if (token.getLexema().equalsIgnoreCase("*")){
                        token.setCodigo(OPERADOR_ARITMETICO);
                }else if (token.getLexema().equalsIgnoreCase("/")){
                        token.setCodigo(OPERADOR_ARITMETICO);
                }else if (token.getLexema().equalsIgnoreCase("+")){
                        token.setCodigo(OPERADOR_ARITMETICO);
                }else if (token.getLexema().equalsIgnoreCase("-")){
                        token.setCodigo(OPERADOR_ARITMETICO);
                }else if (token.getLexema().equalsIgnoreCase("=")){
                        token.setCodigo(OPERADOR_ARITMETICO);
                }else if (token.getLexema().equalsIgnoreCase("==")){
                        token.setCodigo(OPERADOR_LOGICO);
                }else if (token.getLexema().equalsIgnoreCase(":")){
                        token.setCodigo(OPERADOR);
                }else if (token.getLexema().equalsIgnoreCase("{")){
                        token.setCodigo(ABRE_CHAVE);
                }else if (token.getLexema().equalsIgnoreCase("}")){
                        token.setCodigo(FECHA_CHAVE);
                }else if (token.getLexema().equalsIgnoreCase("\t")){
                        token.setCodigo(ESPAÇO_BRANCO);
                }else if (token.getLexema().equalsIgnoreCase("\n")){
                        token.setCodigo(ESPAÇO_BRANCO);
                }else if (token.getLexema().equalsIgnoreCase("\f")){
                        token.setCodigo(ESPAÇO_BRANCO);
                }else if (token.getLexema().equalsIgnoreCase("\\v")){
                        token.setCodigo(ESPAÇO_BRANCO);
                }else if (token.getLexema().equalsIgnoreCase("\n")){
                        token.setCodigo(ESPAÇO_BRANCO);
                }else if (token.getLexema().equalsIgnoreCase("<-")){
                        token.setCodigo(OPERADOR_ATRIBUICAO);
                }
                
		else {
			token.setCodigo(ID);
		}
	}
}
