package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author fabricio@utfpr.edu.br
 */
public class TestaArquivo {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("C:/temp");
        
        diretorio.mkdir();
        File arquivo = new File(diretorio, "lixo.txt");
        File subdir = new File(diretorio, "subdir1");
       
        subdir.mkdir();
        String[] arquivos = diretorio.list();
        for (int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
            System.out.println(filho.getParent());
            System.out.println("É diretorio? " + filho.isDirectory());
            System.out.println("É arquivo? " + filho.isFile());
            System.out.println("Tamanho = " + filho.length() + " bytes.");
        }
        
        if (arquivo.exists()) {
            //arquivo.delete();
            
        } else {
            arquivo.createNewFile();
        }
        FileReader novo = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(novo);
        
        FileWriter wr = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(wr);
        wr.flush();
        bw.write("Leandro");
        bw.close();
        wr.close();
        while(novo.ready()){
            String linha = br.readLine();
            System.out.println("Lido -> " + linha);
                 
        }
    }
}
