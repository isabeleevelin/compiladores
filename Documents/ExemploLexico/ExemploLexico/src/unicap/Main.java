package unicap;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
Scanner nomeArq =new Scanner(System.in);
            String nomeArquivo=JOptionPane.showInputDialog("Nome do arquivo.txt");
            String ArqEscrever = JOptionPane.showInputDialog("Arquivo de escrita.txt");
WriteArq t1=new WriteArq();
		String arq = "d:\\"+nomeArquivo;
		String arq2 = "d:\\"+ArqEscrever;
		try {
			Scan scan = new Scan(arq);
			Token token = scan.getToken();

			while (token != null) {
				System.out.println(token);
				token = scan.getToken();
                                
                                t1.escrever(arq2, token);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
