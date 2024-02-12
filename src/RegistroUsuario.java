import javax.swing.*;
import java.awt.*;

public class RegistroUsuario extends JFrame {
    public RegistroUsuario() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) (screenSize.getWidth() / 2);
        int screenHeight = (int) (screenSize.getHeight() / 2);
        
        setBounds(screenWidth/2, screenHeight/2, screenWidth, screenHeight);

        JPanel panel = new JPanel(null);
        
        // Componentes
        JLabel lblNuevoUsuario = new JLabel("Nuevo Usuario");
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField();
        JLabel lblCorreo = new JLabel("Correo:");
        JTextField txtCorreo = new JTextField();
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField();
        JCheckBox chkTerminos = new JCheckBox("Acepto los términos y condiciones");
        JButton btnCrear = new JButton("Crear");
        JButton btnCancelar = new JButton("Cancelar");

        // Posicionamiento
        int width = 220;
        int height = 30;
        int pX =240;
        int sizeButtons=100;

        lblNuevoUsuario.setBounds(pX+60, 20, width, height);
        lblUsuario.setBounds(pX, 60, width, height);
        txtUsuario.setBounds(pX, 90, width, height);
        lblCorreo.setBounds(pX, 120, width, height);
        txtCorreo.setBounds(pX, 150, width, height);
        lblPassword.setBounds(pX, 180, width, height);
        txtPassword.setBounds(pX, 210, width, height);
        chkTerminos.setBounds(pX, 250, width * 2, height);
        btnCrear.setBounds(pX, 290, sizeButtons, height);
        btnCancelar.setBounds(pX+120, 290, sizeButtons, height);

        // Añadir componentes al panel
        panel.add(lblNuevoUsuario);
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblCorreo);
        panel.add(txtCorreo);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(chkTerminos);
        panel.add(btnCrear);
        panel.add(btnCancelar);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistroUsuario();
    }
}

