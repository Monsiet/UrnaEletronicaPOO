import java.lang.reflect.Array;
import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.HashGeneratorString;
import Model.ManipulaDados;
import View.*;
import Model.*;

public class Main implements ManipulaDados{
    public static void main(String[] args) throws NoSuchAlgorithmException {
        new IdScreen().setVisible(true);


        // List<String> list = ManipulaDados.ler("BancoDeEleitores.txt"); 
        // String[] idEleitores = list.toArray(new String[list.size()]);
        // String elementos = String.join(", ", idEleitores);
        // System.out.println(elementos);
        




        // String[] hash = new String[list.size()];

        // for (int i = 0; i < idEleitores.length; i++) {
        //     hash[i] = HashGeneratorString.generateHashString(idEleitores[i]);
        // }
        // // System.out.println(Arrays.toString(hash));

        // for (int i = 0; i < idEleitores.length; i++) {
        //     ManipulaDados.escreverLogNHash(idEleitores[i], hash[i], "BancoDeEleitores.txt");

        // }
    }
}

    

    
