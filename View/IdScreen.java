package View;

import javax.swing.*;
import java.awt.event.*;

import Controller.*;

public class IdScreen extends JFrame {
    public IdScreen() {
        setTitle("Tela de Login"); 
        setSize(450, 75); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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

                //verifica se é um eleitor e se é valido
                if (VerificarID.validaEleitor(userID.getText())) {
                    dispose();
                    new UrnaScreen(userID.getText()).setVisible(true);
                }

                //verifica se é um admin
                else if (VerificarID.validaAdmin(userID.getText())) {
                    dispose();
                    new MesarioScreen().setVisible(true);
                } 

                //em caso de erro
                else {
                    JOptionPane.showMessageDialog(null,
                    "ID invalido!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
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
