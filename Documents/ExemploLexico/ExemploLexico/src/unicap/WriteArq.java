/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabele
 */
public class WriteArq extends Token {
    
    public static void escrever(String path, Token lexema) {
        
        
		try {
			// O parametro é que indica se deve sobrescrever ou continua no
			// arquivo.
			FileWriter fw = new FileWriter(path, true);
			BufferedWriter conexao = new BufferedWriter(fw);
			conexao.write(lexema.toString());
			conexao.newLine();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
