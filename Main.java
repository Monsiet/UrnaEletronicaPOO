// import View.IdScreen;

import java.util.*;

import Model.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = ManipulaDados.ler("BancoDeEleitoresID.txt");
        System.out.println(list);
    }
}
