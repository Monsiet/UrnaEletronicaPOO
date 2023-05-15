package Model;

import java.io.*;
import java.util.*;

public interface ManipulaDados {
    // serve para ler um arquivo e retornar uma lista contendo cada linha nele
    public static List<String[]> lerChapa(String path) {
        List<String[]> list = new ArrayList<>();
        List<String[]> listHash = new ArrayList<>();

        try {
            File lista = new File(("Projeto\\Model\\" + path));
            Scanner scan = new Scanner(lista);
    
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(" ");
                list.add(new String[]{line[0]});
                listHash.add(new String[]{line[1]});
            }
            scan.close();
    
        } catch (FileNotFoundException excecao) {
            System.out.println("Arquivo nao encontrado: " + path);
            excecao.printStackTrace();
        }
        
        return list;
    }
    

    public static List<String> lerComHash(String path) {
        List<String> list = new ArrayList<>();
        try {
            File lista = new File(("Projeto\\Model\\" + path));
            Scanner scan = new Scanner(lista);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] elements = line.split(" ");
                for (String element : elements) {
                    list.add(element);
                }
            }
            scan.close();

        } catch (FileNotFoundException excecao) {
            System.out.println("Arquivo nao encontrado: " + path);
            excecao.printStackTrace();
        }
        return list;
    }
    // Recebe uma mensagem e um caminho de arquivo para poder escrever a mensagem no arquivo. Direcionada para escrever o log de votação
    public static void escreverLogNHash(String mensagem,String hash,String path) {
        try {
            BufferedWriter texto = new BufferedWriter(new FileWriter( "Projeto\\Model\\" + path, true));
    
            texto.write(mensagem + " ");
            texto.write(hash);
            texto.newLine();
    
            texto.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Serve para apagar o log de votação
    public static void apagarLog(String path) {
        try {
            FileWriter texto = new FileWriter( "Projeto\\Model\\" + path, false);
            texto.write("");
            texto.close();
            System.out.println("Arquivo de log limpo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}