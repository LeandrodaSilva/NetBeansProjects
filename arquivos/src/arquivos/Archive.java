/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

/**
 *
 * @author ld_silva
 */
public class Archive {
    
    public static void writeTxt(String archive, String content) throws IOException{
        File arq = new File(archive, "tet.txt"); 
        FileWriter wr = new FileWriter(arq);
        BufferedWriter bw = new BufferedWriter(wr);
        
        wr.flush();
        bw.write(content);
        bw.close();
        wr.close();
    }
    
    public static StringBuilder readTxt(String archive) throws FileNotFoundException, IOException{
        FileReader arq = new FileReader(archive);
        BufferedReader bf = new BufferedReader(arq); 
        StringBuilder temp = new StringBuilder();
        
        while(arq.ready()) temp.append(bf.readLine());
        
        arq.close();
        bf.close();
        return temp;
    }
}
