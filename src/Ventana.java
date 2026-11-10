import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JTextField txtCodigo;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JComboBox cboCategoria;
    private JLabel lblAnio;
    private JLabel lblCategoria;
    private JLabel lblAutor;
    private JLabel lblTitulo;
    private JLabel lblCodigo;
    private JSpinner spiAnio;
    private JButton btnAgregar;
    private JComboBox cboBuscar;
    private JTextField txtBuscar;
    private JButton btnBuscar;
    private JList lstLibros;
    private JTextField txtCompare;
    private JButton btnComparar;
    private Lista biblioteca = new Lista();

    public Ventana() {
        SpinnerNumberModel snm = new SpinnerNumberModel(2000,2000,2026,1);
        spiAnio.setModel(snm);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                String titulo = txtTitulo.getText();
                String autor = txtAutor.getText();
                String cat = cboCategoria.getSelectedItem().toString();
                int anio = Integer.parseInt(spiAnio.getValue().toString());
                Libro l1 = new Libro(codigo, titulo, autor, cat, anio);
                try {
                    biblioteca.agregar(l1);
                    JOptionPane.showMessageDialog(null,
                            "Se agrego el libro");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage());
                }
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboBuscar.getSelectedIndex();
                DefaultListModel dlm = new DefaultListModel();
                lstLibros.setModel(dlm);

                switch (index) {
                    case 0:     //Busqueda por codigo
                        int codigo = Integer.parseInt(txtBuscar.getText());
                        try {
                            Libro l1 = biblioteca.binario(codigo);
                            dlm.addElement(l1.toString());
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,
                                    ex.getMessage());
                        }
                        break;

                    case 1:     //Busqueda por titulo
                        String titulo = txtBuscar.getText();
                        ArrayList libros = biblioteca.buscar(titulo);
                        dlm.addAll(libros);
                        if(dlm.isEmpty()){
                            dlm.addElement("No se encontraron coincidencias");
                        }
                        break;

                    case 2:     //Mostrar todos
                        dlm.addAll(biblioteca.getLibros());
                        if(dlm.isEmpty()){
                            dlm.addElement("No se encontraron coincidencias");
                        }
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
