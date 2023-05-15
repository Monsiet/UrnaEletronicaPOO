import java.io.IOException;
import java.security.NoSuchAlgorithmException;


import Model.ManipulaDados;
import View.*;
import Model.*;

public class Main implements ManipulaDados, HashGenerator{
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        new IdScreen().setVisible(true);


        // List<String> list = ManipulaDados.lerModif("BaconDeEleitores.txt"); 
        // String[] idEleitores = list.toArray(new String[list.size()]);
        // String elementos = String.join(", ", idEleitores);
        // System.out.println(elementos);
        
        // String[] hash = new String[list.size()];

        // for (int i = 0; i < idEleitores.length; i++) {
        //     hash[i] = HashGeneratorString.generateHashString(idEleitores[i]);
        // }
        // // System.out.println(Arrays.toString(hash));

        // for (int i = 0; i < idEleitores.length; i++) {
        //     ManipulaDados.escreverLogNHash(idEleitores[i], hash[i], "BaconDeEleitoresID.txt");

        // }

        // CriptoHash hashficad = new CriptoHash();

        // hashficad.hashficacao("BaconDeAdmins.txt", "BaconDeChapasAdminsHash.txt");
    }
}

    

    
