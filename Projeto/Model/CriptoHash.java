package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class CriptoHash {

    public void hashficacao(String pathLeitura, String pathEscrita) throws IOException, NoSuchAlgorithmException {
        try (BufferedReader br = new BufferedReader(new FileReader("Projeto\\Model\\" + pathLeitura));
                BufferedWriter bw = new BufferedWriter(new FileWriter("Projeto\\Model\\" + pathEscrita))) {
            String line;
            while ((line = br.readLine()) != null) {
                String hash = HashGeneratorString.generateHashString(line);
                bw.write(line + " " + hash);
                bw.newLine();
            }
        }
    }

    
}