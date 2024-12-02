// Paquete
package Vista;

// Importaciones
import javax.swing.*;
import java.awt.*;

// Formulario Cliente
public class frmMascota extends JFrame {
    // Componentes
    private JMenuBar menuBar;
    private JMenuItem itemNuevo, itemGuardar, itemConsultar, itemModificar, itemEliminar, itemSalir;
    private JTextField txtIdOwner, txtNombre, txtRaza, txtEdad, txtPeso;
    private JComboBox<String> cbSexo;
    private JLabel lblIdOwner, lblNombre, lblRaza, lblEdad, lblSexo, lblPeso;

    // Constructor
    public frmMascota() {
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
        txtIdOwner = new JTextField(15);
        txtNombre = new JTextField(15);
        txtRaza = new JTextField(15);
        txtEdad = new JTextField(15);
        txtPeso = new JTextField(15);

        // Combo box
        cbSexo = new JComboBox<>(new String[] { "Macho", "Hembra" });

        // JLabel
        lblIdOwner = new JLabel("No ID");
        lblNombre = new JLabel("Nombre");
        lblRaza = new JLabel("Raza");
        lblEdad = new JLabel("Edad");
        lblPeso = new JLabel("Peso");
        lblSexo = new JLabel("Sexo");

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
        mainPanel.add(createRow(lblIdOwner, txtIdOwner));
        mainPanel.add(createRow(lblNombre, txtNombre));
        mainPanel.add(createRow(lblRaza, txtRaza));
        mainPanel.add(createRow(lblEdad, txtEdad));
        mainPanel.add(createRow(lblPeso, txtPeso));
        mainPanel.add(createRow(lblSexo, cbSexo));

        // Anadir panel al frame
        mainPanel.setFocusable(true);
        add(mainPanel);
        setTitle("Mascota");
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
        txtIdOwner.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        cbSexo.setSelectedIndex(0);
    }

    // Para probar el codigo
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new frmMascota().setVisible(true));
    }
}