package Controller;

import java.util.*;

import Model.*;

public class VerificarID {
    public static Boolean validaEleitor(String id) {
        //Cria uma lista de eleitores verificando se ele ja votou ou n
        List<Eleitor> idE = new ArrayList<>();
        List<String> listE = new ArrayList<>();
        listE = ManipulaDados.ler("BancoDeEleitoresID.txt");
        List<String> listV = new ArrayList<>();
        listV = ManipulaDados.ler("LogEleitores.txt");
        for(int i = 0; i < listE.size(); i++) {
            String lista = listE.get(i);
            Eleitor eleitor = new Eleitor(lista);
            idE.add(eleitor);
            for(int u = 0; u < listV.size(); u++) {
                if (idE.get(i).getId().equals(listV.get(u))) {
                    idE.get(i).voto();
                }
            }
        }

        boolean valido = false;
        
        for (int i = 0; i < idE.size(); i++) {
            if (id.equals(idE.get(i).getId()) && idE.get(i).getVoto()){
               valido = true;
            }
        }
        
        if (valido) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validaAdmin(String id) {
        //Cria uma lista de admins
        List<Admin> idA = new ArrayList<>();
        List<String> listA = new ArrayList<>();
        listA = ManipulaDados.ler("BaconDeAdmins.txt");
        for(int i = 0; i < listA.size(); i++) {
            String lista = listA.get(i);
            Admin admin = new Admin(lista);
            idA.add(admin);
        }
        
        boolean valido = false;

        for (int i = 0; i < idA.size(); i++) {
            if (id.equals(idA.get(i).getId())){
               valido = true;
            }
        }
        
        if (valido) {
            return true;
        } else {
            return false;
        }
    }
    
}
