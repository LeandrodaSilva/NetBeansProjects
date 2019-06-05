/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author ld_si
 */
public class Main {

    public static void main(String[] args) {

        try {
            StringBuilder lido = Archive.readTxt("C:/temp/tet.txt");
            Scanner scan = new Scanner(lido.toString());
            while (scan.hasNextLine()) {
                String linha = scan.nextLine();
                System.out.println("Lido: "+linha);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
