package Projeto.Model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Eleitor {

    protected String id;
    
    public Eleitor(String id) {
        this.id = id;
    }

    protected String getId(){
        return this.id;
    }
    
    
    public static List<String> readCodigosFromFile(String filePath) throws IOException {
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
