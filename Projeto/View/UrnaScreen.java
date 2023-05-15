package View;

import javax.swing.*;

import Model.ManipulaDados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;



public class UrnaScreen extends JFrame implements ManipulaDados {
    private JList<String> listaChapa;
    private JButton confirmar;

    public UrnaScreen(String id) {
        setTitle("Urna Eletronica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        //texto
        JLabel label = new JLabel("Vote na chapa desejada:");
        add(label);

        //precisa adicionar uma forma de ler o Bacon de dados das chapas para que possa ser informada abaixo


        List<String[]> chapas = ManipulaDados.lerChapa("BaconDeChapasHash.txt");
        String[] names = new String[chapas.size()];
        
        for (int i = 0; i < chapas.size(); i++) {
            String[] subArray = chapas.get(i);
            if (subArray.length >= 2) {
                names[i] = subArray[0] + ", " + subArray[1];
            } else {
                names[i] = subArray[0];
            }
        }
        
        System.out.println ("chapas: " + Arrays.toString(names));


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

                ManipulaDados.escreverLog(id,"BaconDeLogEleitores.txt");
                ManipulaDados.escreverLog(id, selectedName.charAt(0), "BaconDeLogVotos.txt");
                dispose();
                new IdScreen().setVisible(true);
            }
        });
        add(confirmar);

    }
}



            