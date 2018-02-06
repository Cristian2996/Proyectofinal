
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

public class EntradaVista extends JInternalFrame{
  
    JLabel titulo;
    JLabel codigoE;
    JLabel fecha_ingreso;
    JLabel proveedor;
    JLabel factura;
    JLabel fecha_factura;
    JLabel vendedor;

    JTextField txtTitulo1;
    JTextField txtTitulo2;
    JTextField txtTitulo3;
    JTextField txtTitulo4;
    JTextField txtTitulo5;

    List<Proveedor>lstProveedor;
    JComboBox <Proveedor> cmbProveedor;
    JButton btnLimpiar;
    JButton btnAceptar;
    JPanel pnlcentral;
    JPanel pnlpie;

    public EntradaVista() {
        this.setSize(400, 200);
        this.setLayout(new BorderLayout());
        pnlcentral = new JPanel();
        pnlpie = new JPanel();

        pnlcentral.setLayout(new GridLayout(6, 2, 5, 5));
        pnlpie.setLayout(new GridLayout(1, 2, 5, 5));
        titulo = new JLabel("DATOS DE ENTRADA");

        codigoE = new JLabel("Codigo: ");
        txtTitulo1 = new JTextField();
        fecha_ingreso = new JLabel("fecha ingreso: ");
        txtTitulo2 = new JTextField();
        proveedor=new JLabel("Proveedor: ");
        CargarProveedor();
        cmbProveedor = new JComboBox(lstProveedor.toArray());
        factura = new JLabel("N. factura: ");
        txtTitulo3 = new JTextField();
        fecha_factura = new JLabel("fecha factura: ");
        txtTitulo4 = new JTextField();
        vendedor = new JLabel("Vendedor: ");
        txtTitulo5 = new JTextField();
        btnLimpiar = new JButton("LIMPIAR");
        btnAceptar = new JButton("ACEPTAR");
        
        this.add(titulo, BorderLayout.NORTH);
        pnlcentral.add(codigoE);
        pnlcentral.add(txtTitulo1);
        pnlcentral.add(fecha_ingreso);
        pnlcentral.add(txtTitulo2);
        pnlcentral.add(proveedor);
        pnlcentral.add(cmbProveedor);
        pnlcentral.add(factura);
        pnlcentral.add(txtTitulo3);
        pnlcentral.add(fecha_factura);
        pnlcentral.add(txtTitulo4);
        pnlcentral.add(vendedor);
        pnlcentral.add(txtTitulo5);

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

        EntradaVista frmMenu = new EntradaVista();
        frmMenu.setVisible(true);
    }
    
    public void CargarProveedor() {

        IProveedor proveedorDao = new ProveedorImpl();
        try {
            lstProveedor = proveedorDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR LOS PROVEEDORES", "ERROR" + e.getMessage(), JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void btnAceptarActionListener(ActionEvent e) {
        IEntrada entradaDao = new EntradaImpl();

        try {

            Entrada ent = new Entrada();
            ent.setCodigoE(Integer.parseInt(txtTitulo1.getText()));
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                ent.setFecha_ingreso(formatoFecha.parse(txtTitulo2.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FECHA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ent.setProveedor((Proveedor) cmbProveedor.getSelectedItem());
                if (entradaDao.insertar(ent) > 0) {
                    JOptionPane.showMessageDialog(this, "PROCESO CORRECTO!!", "Transaction", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "ERROR", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            ent.setFactura(Integer.parseInt(txtTitulo3.getText()));
//            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                ent.setFecha_factura(formatoFecha.parse(txtTitulo4.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FECHA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            ent.setVendedor(txtTitulo5.getText());
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR !! "+ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}  

