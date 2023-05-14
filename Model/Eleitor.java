package Model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Eleitor extends Usuario {

    protected Boolean voto;
    
    public Eleitor(String id) {
        this.id = id;
        this.voto = true;
    }

    public Boolean getVoto() {
        return voto;
    }

    public void voto() {
        this.voto = false;
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