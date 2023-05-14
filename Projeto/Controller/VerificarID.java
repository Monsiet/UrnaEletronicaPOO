package Controller;

import java.io.IOException;
import java.util.*;

import Model.*;

public class VerificarID {
    
    public static Boolean validaEleitor(String id) throws IOException {
        //Cria uma lista de eleitores verificando se ele ja votou ou n
        List<Eleitor> idEleitor = new ArrayList<>();
        List<String> listEleitor = new ArrayList<>();
        listEleitor = ManipulaDados.ler("Projeto\\Model\\BancoDeEleitoresID.txt");
        List<String> listV = new ArrayList<>();
        listV = ManipulaDados.ler("Projeto\\Model\\LogVotos.txt");
        for(int i = 0; i < listEleitor.size(); i++) {
            String lista = listEleitor.get(i);
            Eleitor eleitor = new Eleitor(lista);
            idEleitor.add(eleitor);
            for(int u = 0; u < listV.size(); u++) {
                if (idEleitor.get(i).getId().equals(listV.get(u))) {
                    idEleitor.get(i).voto();
                }
            }
        }

        boolean valido = false;
        
        for (int i = 0; i < idEleitor.size(); i++) {
            if (id.equals(idEleitor.get(i).getId()) && idEleitor.get(i).getVoto()){
               valido = true;
            }
        }
        
        if (valido) {
            return true;
        } else {
            return false;
        }
    }

    // public static boolean validaAdmin(String id) {
    //     //Cria uma lista de admins
    //     List<Admin> idA = new ArrayList<>();
    //     List<String> listA = new ArrayList<>();
    //     listA = ManipulaDados.ler("Projeto\\Model\\BaconDeAdmins.txt");
    //     for(int i = 0; i < listA.size(); i++) {
    //         String lista = listA.get(i);
    //         Admin admin = new Admin(lista);
    //         idA.add(admin);
    //     }
        
    //     boolean valido = false;

    //     for (int i = 0; i < idA.size(); i++) {
    //         if (id.equals(idA.get(i).getId())){
    //            valido = true;
    //         }
    //     }
        
    //     if (valido) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
    
}