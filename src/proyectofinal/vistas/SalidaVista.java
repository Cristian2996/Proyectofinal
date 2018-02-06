   
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

public class SalidaVista extends JInternalFrame{
    JLabel titulo;
    JLabel codigoS;
    JLabel fecha_registro;
    JLabel fecha_salida;
    JLabel responsable;
    JLabel vendedor;

    JTextField txtTitulo1;
    JTextField txtTitulo2;
    JTextField txtTitulo3;
    JTextField txtTitulo4;
    JTextField txtTitulo5;

    
    JButton btnLimpiar;
    JButton btnAceptar;
    JPanel pnlcentral;
    JPanel pnlpie;

    public SalidaVista() {
        this.setSize(400, 200);
        this.setLayout(new BorderLayout());
        pnlcentral = new JPanel();
        pnlpie = new JPanel();

        pnlcentral.setLayout(new GridLayout(5, 2, 5, 5));
        pnlpie.setLayout(new GridLayout(1, 2, 5, 5));
        titulo = new JLabel("DATOS DE SALIDA");

        codigoS = new JLabel("Codigo: ");
        txtTitulo1 = new JTextField();
        fecha_registro = new JLabel("fecha registro: ");
        txtTitulo2 = new JTextField();
        fecha_salida=new JLabel("fecha salida ");
        txtTitulo3 = new JTextField();
        responsable = new JLabel("Nombre responsable: ");
        txtTitulo4 = new JTextField();        
        vendedor = new JLabel("Vendedor: ");
        txtTitulo5 = new JTextField();
        btnLimpiar = new JButton("LIMPIAR");
        btnAceptar = new JButton("ACEPTAR");
        
        this.add(titulo, BorderLayout.NORTH);
        pnlcentral.add(codigoS);
        pnlcentral.add(txtTitulo1);
        pnlcentral.add(fecha_registro);
        pnlcentral.add(txtTitulo2);
        pnlcentral.add(fecha_salida);
        pnlcentral.add(txtTitulo3);
        pnlcentral.add(responsable);
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

        SalidaVista frmMenu = new SalidaVista();
        frmMenu.setVisible(true);
    }
    public void btnAceptarActionListener(ActionEvent e) {
        ISalida salidaDao = new SalidaImpl();

        try {

            Salida sal = new Salida();
            sal.setCodigoS(Integer.parseInt(txtTitulo1.getText()));
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                sal.setFecha_registro(formatoFecha.parse(txtTitulo2.getText()));
                sal.setFecha_salida(formatoFecha.parse(txtTitulo3.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "FECHA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            sal.setResponsable(txtTitulo4.getText());
            sal.setVendedor(txtTitulo5.getText());  

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR !! "+ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
