// Paquete
package Vista;

// Importaciones
import java.awt.*;
import javax.swing.*;

// Formulario empleado
public class frmEmpleado extends JFrame {
    // Componentes
    private JMenuBar menuBar;
    private JMenuItem itemNuevo, itemGuardar, itemConsultar, itemModificar, itemEliminar, itemSalir;
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
        itemNuevo = new JMenu("Nuevo");
        itemGuardar = new JMenu("Guardar");
        itemConsultar = new JMenu("Consultar");
        itemModificar = new JMenu("Modificar");
        itemEliminar = new JMenu("Eliminar");
        itemSalir = new JMenu("Salir");

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

        // Eventos
        itemNuevo.addActionListener(e -> onNuevo());
        itemSalir.addActionListener(e -> System.exit(0));

        // Anadir items al menu
        menuBar.add(itemNuevo);
        menuBar.add(itemGuardar);
        menuBar.add(itemConsultar);
        menuBar.add(itemModificar);
        menuBar.add(itemEliminar);
        menuBar.add(itemSalir);
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

    // Eventos
    /// Nuevo
    private void onNuevo() {
        // Limpiar textos
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNacimiento.setText("");
        cbGenero.setSelectedIndex(0);
        cbCargo.setSelectedIndex(0);
    }

    // Para probar el codigo
    /*
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new frmEmpleado().setVisible(true));
    }
    */
}