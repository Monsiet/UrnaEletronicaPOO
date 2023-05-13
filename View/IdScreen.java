package View;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import Model.*;

public class IdScreen extends JFrame {
    public IdScreen() {
        setTitle("Tela de Login"); 
        setSize(450, 75); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Cria uma lista de eleitores verificando se ele ja votou ou n
        List<Eleitor> idE = new ArrayList<>();
        List<String> listE = new ArrayList<>();
        listE = ManipulaDados.ler("BancoDeEleitoresID.txt");
        List<String> listV = new ArrayList<>();
        listV = ManipulaDados.ler("LogVotos.txt");
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

        //Cria uma lista de admins
        List<Admin> idA = new ArrayList<>();
        List<String> listA = new ArrayList<>();
        listA = ManipulaDados.ler("BaconDeAdmins.txt");
        for(int i = 0; i < listA.size(); i++) {
            String lista = listA.get(i);
            Admin admin = new Admin(lista);
            idA.add(admin);
        }
        

        //tela com texto
        JPanel panel = new JPanel();
        panel.add(new JLabel("insira seu ID:"));
        //caxa de texto, para que o usuario possa inserir seu id
        JTextField userID = new JTextField(20);
        panel.add(userID);
        //botão para que o usuario possa confirmar a informação inserida
        JButton continuar = new JButton("continuar");
        continuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Boolean s = true;

                //loop pra verificar se o id inserido pertence ao banco de dados de eleitores
                for (int i = 0; i < idE.size(); i++) {
                    if (userID.getText().equals(idE.get(i).getId()) && idE.get(i).getVoto()) {
                        s = false;
                        dispose();
                        new UrnaScreen(idE.get(i).getId()).setVisible(true);
                    }
                }

                //precisa adicionar um loop que nem o de cima só que pra verificar se pertence ao banco de dados dos admins
                for (int i = 0; i < idA.size(); i++) {
                    if (userID.getText().equals(idA.get(i).getId())) {
                        s = false;
                        dispose();
                        new MesarioScreen().setVisible(true);
                    }
                }

                //tela de aviso em caso de erro
                if (s) {
                    JOptionPane.showMessageDialog(null, "ID invalido!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                } 
            
            }
        });
        panel.add(continuar);
        add(panel);
    }
    //apenas para test
    public static void main(String[] args) {
        new IdScreen().setVisible(true);
    }
}
