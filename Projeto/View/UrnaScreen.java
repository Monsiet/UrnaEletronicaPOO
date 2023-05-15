package View;

import javax.swing.*;
import Model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.List;



public class UrnaScreen extends JFrame implements ManipulaDados {
    private JList<String> listaChapa;
    private JButton confirmar;

    public UrnaScreen(String id) throws FileNotFoundException {
        setTitle("Urna Eletronica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        //texto
        JLabel label = new JLabel("Vote na chapa desejada:");
        add(label);
        //precisa adicionar uma forma de ler o banco de dados das chapas para que possa ser informada abaixo
        List<String> chapas = ManipulaDados.lerComHash("BancoDeChapas.txt");
        String[] names = chapas.toArray(new String[chapas.size()]);
        System.out.println ("chapas: " + names);

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
                JOptionPane.showMessageDialog(null, "Chapa selecionada: " + selectedName);

                ManipulaDados.escreverLogNHash(id," ", "BandoDeLogVotos.txt");
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
                try {
                    new UrnaScreen("").setVisible(true);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
