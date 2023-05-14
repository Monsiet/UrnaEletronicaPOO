package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UrnaScreen extends JFrame {
    private JList<String> listaChapa;
    private JButton confirmar;

    public UrnaScreen() {
        setTitle("Urna Eletronica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        //texto
        JLabel label = new JLabel("Vote na chapa desejada:");
        add(label);
        //precisa adicionar uma forma de ler o banco de dados das chapas para que possa ser informada abaixo
        String[] names = {"Chapa 1", "Chapa 2", "Chapa 3", "Chapa 4", "Chapa 5"};

        listaChapa = new JList<>(names);
        listaChapa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(listaChapa);
        scrollPane.setPreferredSize(new Dimension(150, 100));
        add(scrollPane);

        confirmar = new JButton("Confirmar");
        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedName = listaChapa.getSelectedValue();
                JOptionPane.showMessageDialog(null, "Nome selecionado: " + selectedName);

                dispose();
                new IdScreen().setVisible(true);
            }
        });
        add(confirmar);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UrnaScreen().setVisible(true);
            }
        });
    }
}
