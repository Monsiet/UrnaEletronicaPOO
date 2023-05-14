// import View.IdScreen;

import java.io.*;
import java.util.*;

import Model.*;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\victo\\OneDrive\\Área de Trabalho\\Projeto\\Model\\BancoDeEleitoresID.txt";
        List<Eleitor> id = new ArrayList<>();
        try {
            File ids = new File(path);
            Scanner scan = new Scanner(ids);

            while (scan.hasNextLine()) {
                Eleitor eleitor = new Eleitor(scan.nextLine());
                id.add(eleitor);
            }
            //023002315
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + path);
            e.printStackTrace();
        }


        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i));
        }
    }
}
