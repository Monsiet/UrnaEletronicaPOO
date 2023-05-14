package View;

import javax.swing.*;

import Model.ManipulaDados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MesarioScreen extends JFrame {
    public MesarioScreen() {
        setTitle("Mesario");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton retormar = new JButton("Retornar à Votação");
        JButton cancelar = new JButton("Cancelar Votação");
        JButton resultados = new JButton("Resultados");

        panel.add(retormar);
        panel.add(cancelar);
        panel.add(resultados);

        add(panel);

        retormar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para retornar à votação
                JOptionPane.showMessageDialog(MesarioScreen.this, "Retornando à votação...");

                dispose();
                new IdScreen().setVisible(true);
            }
        });

        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cancelar a votação
                JOptionPane.showMessageDialog(MesarioScreen.this, "Votação cancelada!");
                ManipulaDados.apagarLog("LogVotos.txt");
                ManipulaDados.apagarLog("LogEleitores.txt");
                dispose();
                new IdScreen().setVisible(true);
            }
        });

        resultados.addActionListener(new ActionListener() {
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