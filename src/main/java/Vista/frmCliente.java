// Paquete
package Vista;

// Importaciones
import javax.swing.*;
import java.awt.*;

// Formulario Cliente
public class frmCliente extends JFrame {
    // Componentes
    private JMenuBar menuBar;
    private JMenuItem itemNuevo, itemGuardar, itemConsultar, itemModificar, itemEliminar, itemSalir;
    private JTextField txtId, txtNombre, txtApellido, txtNtel, txtDireccion, txtEmail;
    private JComboBox<String> cbTipo;
    private JLabel lblId, lblNombre, lblApellido, lblTipo, lblNtel, lblDireccion, lblEmail;

    // Constructor
    public frmCliente() {
        componentes();
    }
    
    // Incializar componentes
    private void componentes() {
        // Menu bar
        menuBar = new JMenuBar();

        // Items
        itemNuevo = new JMenuItem("Nuevo");
        itemGuardar = new JMenuItem("Guardar");
        itemConsultar = new JMenuItem("Consultar");
        itemModificar = new JMenuItem("Modificar");
        itemEliminar = new JMenuItem("Eliminar");
        itemSalir = new JMenuItem("Salir");

        // Text field
        txtId = new JTextField(15);
        txtNombre = new JTextField(15);
        txtApellido = new JTextField(15);
        txtNtel = new JTextField(15);
        txtDireccion = new JTextField(15);
        txtEmail = new JTextField(15);

        // Combo box
        cbTipo = new JComboBox<>(new String[] { "Tipo 1", "Tipo 2", "Otro" });

        // JLabel
        lblId = new JLabel("No ID");
        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblTipo = new JLabel("Tipo");
        lblNtel = new JLabel("Numero de telefono");
        lblDireccion = new JLabel("Direccion");
        lblEmail = new JLabel("Correo electronico");

        // Eventos
        itemNuevo.addActionListener(e -> onNuevo());
        itemSalir.addActionListener(e -> dispose());

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
        mainPanel.add(createRow(lblNtel, txtNtel));
        mainPanel.add(createRow(lblDireccion, txtDireccion));
        mainPanel.add(createRow(lblEmail, txtEmail));
        mainPanel.add(createRow(lblTipo, cbTipo));

        // Anadir panel al frame
        mainPanel.setFocusable(true);
        add(mainPanel);
        setTitle("Cliente");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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
        txtNtel.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        cbTipo.setSelectedIndex(0);
    }

    // Para probar el codigo
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new frmCliente().setVisible(true));
    }
}