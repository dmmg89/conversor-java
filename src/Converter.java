import ConversionData.LengthEquivalencies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/**
 *
 *
 *
 */
public class Converter {

    static String welcomeMessage = "Bienvenido al conversor \n El programa puede convertir " +
                                                        "algunas magnitudes a sus equivalentes\n"+
                                                        "Este proyecto es un reto propuesto por Alura";


    public static void main( String[] args ) {

        JPanel welcomePanel = new JPanel();
        welcomePanel.setPreferredSize(new Dimension(300,300));
        JLabel presentation = new JLabel(welcomeMessage);
        welcomePanel.add(presentation);
        JOptionPane.showMessageDialog(null,welcomePanel);



        JRadioButton radioButton1 = new JRadioButton("Moneda",true);
        JRadioButton radioButton2 = new JRadioButton("Longitud",false);
        JRadioButton radioButton3 = new JRadioButton("Area",false);

        // Crear un grupo de botones de opción
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        // Crear la lista desplegable
        String[] opciones = new String[5];
        LengthEquivalencies length = new LengthEquivalencies();

        JComboBox<String> comboBox1 = new JComboBox<>(opciones);
        JComboBox<String> comboBox2 = new JComboBox<>(opciones);

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(radioButton1.isSelected()){
                    for (int index = 0; index<length.opciones.length;index++){
                        opciones[index] = length.opciones[index];
                    }

                }
            }
        });

      /*  if (radioButton1.isSelected()) {
             comboBox1 = new JComboBox<>(length.opciones);
             comboBox2 = new JComboBox<>(length.opciones);
        }else {
             comboBox1 = new JComboBox<>(opciones);
             comboBox2 = new JComboBox<>(opciones);
        }*/
        // Crear un JPanel para agrupar los componentes
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(540,380));

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(comboBox1);
        panel.add(comboBox2);

        // Mostrar los componentes en un JOptionPane
        JOptionPane.showMessageDialog(null, panel,
                                "Selecciona una opción", JOptionPane.QUESTION_MESSAGE);

        // Obtener la opción seleccionada
        if (radioButton1.isSelected()) {
            System.out.println("Opción 1 seleccionada");
        } else if (radioButton2.isSelected()) {
            System.out.println("Opción 2 seleccionada");
        } else if (radioButton3.isSelected()) {
            System.out.println("Opción 3 seleccionada");
        }

        String opcionSeleccionada = (String) comboBox1.getSelectedItem();
        System.out.println("Opción seleccionada en el ComboBox: " + opcionSeleccionada);


    }
}
