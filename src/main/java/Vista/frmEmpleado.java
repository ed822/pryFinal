// Paquete
package Vista;

// Importaciones
import java.awt.*;
import javax.swing.*;

// Formulario empleado
public class frmEmpleado extends JFrame {
    // Componentes
    private JMenuBar menuBar;
    private JMenu menuNuevo, menuGuardar, menuConsultar, menuModificar, menuEliminar, menuSalir;
    private JTextField txtId, txtNombre, txtApellido, txtFechaNacimiento;
    private JComboBox<String> cbGenero, cbCargo;
    private JLabel lblId, lblNombre, lblApellido, lblGenero, lblCargo, lblFechaNacimiento;

    // Constructor
    public frmEmpleado() {
        initComponents();
    }
    
    // Incializar componentes
    private void initComponents() {
        // Menu
        menuBar = new JMenuBar();
        menuNuevo = new JMenu("Nuevo");
        menuGuardar = new JMenu("Guardar");
        menuConsultar = new JMenu("Consultar");
        menuModificar = new JMenu("Modificar");
        menuEliminar = new JMenu("Eliminar");
        menuSalir = new JMenu("Salir");

        // Text field
        txtId = new JTextField(15);
        txtNombre = new JTextField(15);
        txtApellido = new JTextField(15);
        txtFechaNacimiento = new JTextField(15);

        // Combo box
        cbGenero = new JComboBox<>(new String[] { "Masculino", "Femenino", "Otro" });
        cbCargo = new JComboBox<>(new String[] { "Empleado", "Gerente", "Supervisor" });

        // JLabel
        lblId = new JLabel("No ID");
        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblGenero = new JLabel("Género");
        lblCargo = new JLabel("Cargo");
        lblFechaNacimiento = new JLabel("Fecha de Nacimiento");

        // Menu bar configuration
        menuNuevo.addActionListener(e -> onNuevo());
        menuSalir.addActionListener(e -> System.exit(0));

        menuBar.add(menuNuevo);
        menuBar.add(menuGuardar);
        menuBar.add(menuConsultar);
        menuBar.add(menuModificar);
        menuBar.add(menuEliminar);
        menuBar.add(menuSalir);
        setJMenuBar(menuBar);

        // Panel "main" (principal)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Anadir componentes al panel
        mainPanel.add(createRow(lblId, txtId));
        mainPanel.add(createRow(lblNombre, txtNombre));
        mainPanel.add(createRow(lblApellido, txtApellido));
        mainPanel.add(createRow(lblFechaNacimiento, txtFechaNacimiento));
        mainPanel.add(createRow(lblGenero, cbGenero));
        mainPanel.add(createRow(lblCargo, cbCargo));

        // Anadir panel al frame
        add(mainPanel);

        setTitle("Empleado");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // Crear row
    private JPanel createRow(JLabel label, JComponent component) {
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rowPanel.add(label);
        rowPanel.add(component);
        return rowPanel;
    }

    // onNuevo (cuando nuevo)
    private void onNuevo() {
        // Limpiar textos
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNacimiento.setText("");
        cbGenero.setSelectedIndex(0);
        cbCargo.setSelectedIndex(0);
    }

    // Main
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new frmEmpleado().setVisible(true));
    }
}