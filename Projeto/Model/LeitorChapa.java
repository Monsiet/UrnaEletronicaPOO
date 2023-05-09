package Projeto.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorChapa extends Chapa{
    
    public static String readChapasFromFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] chapaData = line.split(",");
            Chapa chapa = new Chapa(chapaData[0], chapaData[1], chapaData[2], chapaData[3]);
            sb.append(chapa.toString()).append("\n");
        }
        br.close();
        return sb.toString();
    }
}