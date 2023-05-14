package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;

public class MesarioScreen extends JFrame {
    public MesarioScreen() {
        setTitle("Mesario");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton retornarButton = new JButton("Retornar à Votação");
        JButton pararButton = new JButton("Parar Votação");
        JButton resultadosButton = new JButton("Resultados");

        panel.add(retornarButton);
        panel.add(pararButton);
        panel.add(resultadosButton);

        add(panel);

        retornarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para retornar à votação
                JOptionPane.showMessageDialog(MesarioScreen.this, "Retornando à votação...");

                dispose();
                new IdScreen().setVisible(true);
            }
        });

        pararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para parar a votação
                JOptionPane.showMessageDialog(MesarioScreen.this, "Votação parada!");
                ManipulaDados.apagarLog("LogVotos.txt");
                dispose();
                new IdScreen().setVisible(true);
            }
        });

        resultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para exibir os resultados
                JOptionPane.showMessageDialog(MesarioScreen.this, "Exibindo resultados...");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MesarioScreen().setVisible(true);
            }
        });
    }
}