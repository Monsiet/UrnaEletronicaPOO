package Model;

import java.io.*;
import java.util.*;

public class ManipulaDados {
    public static List<String> ler(String path) {
        List<String> list = new ArrayList<>();
        try {
            File lista = new File(("\\Users\\alcan\\Downloads\\UrnaEletronicaPOO-Benevas\\Projeto\\Model\\" + path));
            Scanner scan = new Scanner(lista);

            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
            scan.close();

        } catch (FileNotFoundException essecao) {
            System.out.println("Arquivo não encontrado: " + path);
            essecao.printStackTrace();
        }
        return list;
    }

    public static void escreverLog(String mensagem, String path) {
        try {
            BufferedWriter texto = new BufferedWriter(new FileWriter(
                "\\Users\\alcan\\Downloads\\UrnaEletronicaPOO-Benevas\\Projeto\\Model\\" 
                + path, true));
    
            texto.write(mensagem);
            texto.newLine();
    
            texto.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void apagarLog(String path) {
        try {
            FileWriter texto = new FileWriter(
                "\\Users\\alcan\\Downloads\\UrnaEletronicaPOO-Benevas\\Projeto\\Model\\"
                + path, false);
            texto.write("");
            texto.close();
            System.out.println("Arquivo de log limpo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
