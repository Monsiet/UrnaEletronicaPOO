package Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ManipulaDados {
    //metodos de ler e escrever banco de dados
    
    public static List<String> ler(String filePath) throws IOException {
        List<String> codigos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            codigos.add(line);
        }
        br.close();
        return codigos;
    }
    
}
