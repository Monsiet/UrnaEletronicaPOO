package View;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

    JTextField login;
    JPasswordField senha;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton logar = new JButton("Logar");
        logar.setBounds(100, 250, 100, 33);
        logar.setFont(new Font("Arial", Font.ITALIC, 20));
        add(logar);

        login = new JTextField("login");
        login.setBounds(50, 75, 200, 33);
        login.setFont(new Font("Arial", Font.ITALIC, 30));
        add(login);

        senha = new JPasswordField("senha");
        senha.setBounds(50, 150, 200, 33);
        senha.setFont(new Font("Arial", Font.ITALIC, 30));
        add(senha);

        logar.addActionListener(this::log);
    }

    private void log(ActionEvent actionEvent) {
        String l = login.getText();
        String s = String.valueOf(senha.getPassword());

        if (l.equals("viado") && s.equals("sim")){
            new Urna();
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Senha ou login invalido(s)!",
            "Erro no login", JOptionPane.WARNING_MESSAGE);
        }
    }
}
