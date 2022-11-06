package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
public class Test3 {
    private JButton enviarButton;
    private JPanel panelMain;
    private JTextField textNombre;
    private JTextField textEdad;
    private JLabel lbldata;

    /*
        Actividad realizar una ventana de login que implemente el uso de excepciones
        a traves de try y catch en caso de ingresar un correo electronico en formato incorrecto y una contraseña
        que no cumpla con los criterios configurados.
     */

    public Test3() {
        JFrame ventana = new JFrame("APP");
        lanzaVentana(ventana);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarDatos(textNombre.getText(), textEdad.getText());
            }
        });
    }

    public void procesarDatos(String nombre, String edad) {
        try {
            int edadPersona = Integer.parseInt(edad);
            lbldata.setText("Hola, " + nombre + "\n tu edad es: " + edadPersona);
        } catch (NumberFormatException | InputMismatchException ex) {
            JOptionPane.showMessageDialog(null, "Por favor revisar los datos ingresados.");
        }
    }
    private void lanzaVentana(JFrame ventana) {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(panelMain);
        ventana.pack();
        ventana.setVisible(true);
    }



}