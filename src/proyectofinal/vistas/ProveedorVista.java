
package proyectofinal.vistas;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import proyectofinal.Impl.*;
import proyectofinal.dao.*;
import proyectofinal.entidades.*;
import java.util.*;

public class ProveedorVista extends JInternalFrame{
   JLabel titulo;
    JLabel codigoPv;
    JLabel nombre;
    JLabel apellido;
    JLabel cedula;
    JLabel direccion;
    JLabel distrito;
    JLabel email;
    JLabel telefono;
    JLabel sexo;

     JTextField txCodi;
    JTextField txNombre;
    JTextField txApellido;
    JTextField txCedula;
    JTextField txDir;
    JTextField txDistrito;
    JTextField txEmail;
    JTextField txTelf;

    JComboBox cmbGenero;

    JButton btnLimpiar;
    JButton btnAceptar;
    JPanel pnlcentral;
    JPanel pnlpie; 

    public ProveedorVista() {
        this.setSize(640, 400);
        this.setLayout(new BorderLayout());
        pnlcentral = new JPanel();
        pnlpie = new JPanel();

        pnlcentral.setLayout(new GridLayout(9, 2, 5, 5));
        pnlpie.setLayout(new GridLayout(1, 2, 5, 5));
        titulo = new JLabel("DATOS DEL CLIENTE");

        codigoPv = new JLabel("Codigo: ");

        nombre = new JLabel("Nombre: ");

        apellido = new JLabel("Apellido: ");

        cedula = new JLabel("Cedula: ");
        direccion = new JLabel("Direccion: ");
        distrito=new JLabel("Distrito: ");
        email=new JLabel("Email: ");
        telefono = new JLabel("Numero telefono: ");

        sexo = new JLabel("Genero: ");


        txCodi = new JTextField();
        
        txNombre = new JTextField();
        txApellido = new JTextField();
        txCedula = new JTextField();
        txDir = new JTextField();
        txDistrito=new JTextField();
        txEmail=new JTextField();
        txTelf = new JTextField();
        cmbGenero = new JComboBox(new String[]{"masculino", "femenino"});
        
        btnLimpiar = new JButton("LIMPIAR");
        btnAceptar = new JButton("ACEPTAR");
        this.add(titulo, BorderLayout.NORTH);
        pnlcentral.add(codigoPv);
        pnlcentral.add(txCodi);
        pnlcentral.add(nombre);
        pnlcentral.add(txNombre);
        pnlcentral.add(apellido);
        pnlcentral.add(txApellido);
        pnlcentral.add(cedula);
        pnlcentral.add(txCedula);
        pnlcentral.add(direccion);
        pnlcentral.add(txDir);
        pnlcentral.add(distrito);
        pnlcentral.add(txDistrito);
        pnlcentral.add(email);
        pnlcentral.add(txEmail);
        pnlcentral.add(telefono);
        pnlcentral.add(txTelf);
        pnlcentral.add(sexo);
        pnlcentral.add(cmbGenero);

        pnlpie.add(btnLimpiar);
        pnlpie.add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAceptarActionListener(e);
                } catch (Exception ex) {
                    System.out.print("error " + ex.getMessage());
                }
            }
        });
        this.add(titulo, BorderLayout.NORTH);
        this.add(pnlcentral, BorderLayout.CENTER);
        this.add(pnlpie, BorderLayout.SOUTH);
        this.setClosable(true);
    }
    public static void main(String[] args) {

        ProveedorVista frmMenu = new ProveedorVista();
        frmMenu.setVisible(true);

    }
    public void btnAceptarActionListener(ActionEvent e) {
        IProveedor proveedorDao = new ProveedorImpl();

        try {

            Proveedor prove = new Proveedor();
            prove.setCodigoPv(Integer.parseInt(txCodi.getText()));
            prove.setNombre(txNombre.getText());
            prove.setApellido(txApellido.getText());
            prove.setCedula(txCedula.getText());
            prove.setDireccion(txDir.getText());
            prove.setDistrito(txDistrito.getText());
            prove.setEmail(txEmail.getText());
            prove.setTelefono(txTelf.getText());
            prove.setSexo(cmbGenero.getSelectedIndex() == 0 ? "M" : "F");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR !! "+ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
