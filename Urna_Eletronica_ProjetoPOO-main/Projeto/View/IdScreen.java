package View;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import Model.Eleitor;

public class IdScreen extends JFrame {
    public IdScreen() {
        setTitle("Tela de Login"); 
        setSize(450, 75); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Leitura de arquivo, criando obejtos com base nos dados e adicionando em uma lista
        String path = "\\Users\\alcan\\Downloads\\UrnaEletronicaPOO-Benevas\\Projeto\\Model\\BancoDeEleitoresID.txt";
        List<Eleitor> id = new ArrayList<>();
        try {
            File ids = new File(path);
            Scanner scan = new Scanner(ids);

            while (scan.hasNextLine()) {
                Eleitor eleitor = new Eleitor(scan.nextLine());
                id.add(eleitor);
            }
            //023002764
            scan.close();

        } catch (FileNotFoundException essecao) {
            System.out.println("Arquivo não encontrado: " + path);
            essecao.printStackTrace();
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
                for (int i = 0; i < id.size(); i++) {
                    if (userID.getText().equals(id.get(i).getId()) && id.get(i).getVoto()) {
                        s = false;
                        dispose();
                        new UrnaScreen().setVisible(true);
                        id.get(i).voto();
                    }
                }
                //precisa adicionar um loop que nem o de cima só que pra verificar se pertence ao banco de dados dos admins
                if (userID.getText().equals("admin")) {
                    s = false;
                    dispose(); 
                    new MesarioScreen().setVisible(true);
                }
                //tela de aviso em caso de erro
                if (s) {
                    JOptionPane.showMessageDialog(null, "ID invalido!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                } 
                

                // if (lista.contains(userID.getText())) {
                //     dispose(); 
                //     new UrnaScreen().setVisible(true);
                // } else if (userID.getText().equals("admin")) {
                //     dispose(); 
                //     new MesarioScreen().setVisible(true);
                // } else {
                //     JOptionPane.showMessageDialog(null, "ID invalido!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                // }
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
