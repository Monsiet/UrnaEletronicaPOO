package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

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

    public void criptografiaArquivo(File pathLeitura, String pathEscrita) throws IOException, NoSuchAlgorithmException {
        String hashArq = HashGeneratorArquivo.generateHashFile(pathLeitura);

    }
}