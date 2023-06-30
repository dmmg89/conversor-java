import javax.swing.*;
import java.awt.*;

public class Converter {
    public static void main( String[] args ){

        UIManager.put("OptionPane.minimumSize",new Dimension(640,400));
        Object[] opciones = {"Entrada 1", "Entrada 2", "Entrada 3"};

        Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opción",
               "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        //String entry =  JOptionPane.showInputDialog("Ingresa el valor a convertir");
        JOptionPane.showMessageDialog(null,"El valor ingresado es " +  opcion);

    }
}
