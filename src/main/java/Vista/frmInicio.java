/* Clase Main */

// Paquete
package Vista;

// Importaciones
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;

// Formulario incio
public class frmInicio extends JFrame {
    // Variables
    private JMenuBar menuBar;
    private JMenuItem itemEmpleado, itemCliente, itemMascota, itemSalir;

    // Constructor
    public frmInicio() {
        componentes();
    }

    private void componentes() {
        // Menu bar
        menuBar = new JMenuBar();

        // Items
        itemEmpleado = new JMenuItem("Empleado");
        itemCliente = new JMenuItem("Cliente");
        itemMascota = new JMenuItem("Mascota");
        itemSalir = new JMenuItem("Salir");

        // Acciones de items
        itemEmpleado.addActionListener(this::onEmpleado);
        itemCliente.addActionListener(this::onCliente);
        itemMascota.addActionListener(this::onMascota);
        itemSalir.addActionListener(e -> System.exit(0));

        // Anadir items al menu
        menuBar.add(itemEmpleado);
        menuBar.add(itemCliente);
        menuBar.add(itemMascota);
        menuBar.add(itemSalir);

        // Menu bar
        setJMenuBar(menuBar);

        // Frame
        JLabel lblWelcome = new JLabel("Bienvenido al Sistema de Gestión Veterinaria", JLabel.CENTER);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(lblWelcome, BorderLayout.CENTER);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
 
        add(mainPanel);
 
        setTitle("Pantalla de inicio");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // Eventos
    /// Empleado
    private void onEmpleado(ActionEvent e) {
        new frmEmpleado().setVisible(true);
    }

    /// Cliente
    private void onCliente(ActionEvent e) {
        new frmCliente().setVisible(true);
    }

    /// Mascota
    private void onMascota(ActionEvent e) {
        new frmMascota().setVisible(true);
    }

    // Main
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new frmInicio().setVisible(true));
    }
}