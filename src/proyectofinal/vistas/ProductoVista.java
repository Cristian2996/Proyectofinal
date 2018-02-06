
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

public class ProductoVista extends JInternalFrame{
    JLabel titulo;
    JLabel codigoP;
    JLabel producto;
    JLabel cantidad;
    JLabel precio_unitario;
    JLabel precio_total;
    JLabel fecha_anulacion;
    

     JTextField txCodi;
    JTextField txProducto;
    JTextField txCantidad;
    JTextField txPreUnitario;
    JTextField txPreTotal;
    JTextField txFechaAnu;

    JButton btnLimpiar;
    JButton btnAceptar;
    JPanel pnlcentral;
    JPanel pnlpie;

    public ProductoVista() {
        this.setSize(640, 400);
        this.setLayout(new BorderLayout());
        pnlcentral = new JPanel();
        pnlpie = new JPanel();

        pnlcentral.setLayout(new GridLayout(6, 2, 5, 5));
        pnlpie.setLayout(new GridLayout(1, 2, 5, 5));
        titulo = new JLabel("DATOS DEL CLIENTE");

        codigoP = new JLabel("Codigo: ");

        producto = new JLabel("Nombre producto: ");

        cantidad = new JLabel("Cantidad: ");

        precio_unitario = new JLabel("Precio Unitario: ");
        precio_total= new JLabel("Precio Total: ");

        fecha_anulacion = new JLabel("fecha anulacion: ");


        txCodi = new JTextField();
        
        txProducto = new JTextField();
        txCantidad = new JTextField();
        txPreUnitario = new JTextField();
        txPreTotal = new JTextField();
  
        txFechaAnu = new JTextField();
        
        btnLimpiar = new JButton("LIMPIAR");
        btnAceptar = new JButton("ACEPTAR");
        this.add(titulo, BorderLayout.NORTH);
        pnlcentral.add(codigoP);
        pnlcentral.add(txCodi);
        pnlcentral.add(producto);
        pnlcentral.add(txProducto);
        pnlcentral.add(cantidad);
        pnlcentral.add(txCantidad);
        pnlcentral.add(precio_unitario);
        pnlcentral.add(txPreUnitario);
        pnlcentral.add(precio_total);
        pnlcentral.add(txPreTotal);
        pnlcentral.add(fecha_anulacion);
        pnlcentral.add(txFechaAnu);
   
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

        ProductoVista frmMenu = new ProductoVista();
        frmMenu.setVisible(true);

    }
    public void btnAceptarActionListener(ActionEvent e) {
        IProducto productoDao = new ProductoImpl();

        try {

            Producto pro = new Producto();
            pro.setCodigoP(Integer.parseInt(txCodi.getText()));
            pro.setProducto(txProducto.getText());
            pro.setCantidad(Integer.parseInt(txCantidad.getText()));
            pro.setPrecio_unitario(Double.parseDouble(txPreUnitario.getText()));
            pro.setPrecio_total(Double.parseDouble(txPreTotal.getText()));
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                pro.setFecha_anulacion(formatoFecha.parse(txFechaAnu.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FECHA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } 

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR !! "+ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    

}
