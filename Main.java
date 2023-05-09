import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Controller.Candidato.

public class Main {
    public static void main(String[] args) {
        String path = "Model\\Candidatos.txt";
        List<Candidato. list = new ArrayList<Candidato.();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();

            while (line != null) {
                String[] objeto = line.split(",");

                String nome = objeto[0];
                String id = objeto[1];

                Candidato.cand = new Candidato.nome, id);

                list.add(cand);

                line = br.readLine();
            }

            // System.out.println("Candidatos: ");
            // for (Candidatos c : list) {
            //     System.out.println(c);
            // }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        int i = 0;
        do {
            if ("1111" == list[i]) {
                Integer.parseInt(list[i + 2]) ++;
            }
            else {
                i++;
            }
        }   while ("1111" != list[i])
    }
}
