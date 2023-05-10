package View;

import javax.swing.*;
import java.awt.event.*;

public class LoginScreen extends JFrame {
    public LoginScreen() {
        // configura a janela de login
        setTitle("Tela de Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adiciona um painel com campos de entrada para o nome de usuário e senha
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome de usuário:"));
        JTextField usernameField = new JTextField(20);
        panel.add(usernameField);
        panel.add(new JLabel("Senha:"));
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);

        // adiciona um botão para fazer login
        JButton loginButton = new JButton("Fazer Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // verifica o nome de usuário e senha
                if (usernameField.getText().equals("admin") && new String(passwordField.getPassword()).equals("senha")) {
                    // se o login for bem-sucedido, fecha a janela de login e abre a nova janela
                    dispose(); // fecha a janela atual de login
                    new MainScreen().setVisible(true); // abre a nova janela
                } else {
                    // se o login falhar, exibe uma mensagem de erro
                    JOptionPane.showMessageDialog(null, "Nome de usuário ou senha inválidos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(loginButton);

        // exibe o painel
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}

class MainScreen extends JFrame {
    public MainScreen() {
        // configura a nova janela
        setTitle("Tela Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adiciona um painel com uma mensagem de boas-vindas
        JPanel panel = new JPanel();
        panel.add(new JLabel("Bem-vindo à tela principal!"));

        // exibe o painel
        add(panel);
    }
}