/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

/**
 *
 * @author CRISTIAN
 */
public class FrmMenuPrincipal extends JFrame {

    JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniLogin;
    JMenuItem mniSalir;
    JMenu mnCliente;
    JMenuItem mniNuevoCliente;
    JMenuItem mniModificaCliente;
    JMenuItem mniEliminaCliente;
    JMenuItem mniBuscarCliente;
    JMenuItem mniListarCliente;
    JMenu mnEntrada;
    JMenuItem mniNuevoEntrada;
    JMenuItem mniModificaEntrada;
    JMenuItem mniEliminaEntrada;
    JMenuItem mniBuscaEntrada;
    JMenuItem mniListaEntrada;
    JMenu mnKardex;
    JMenuItem mniNuevoKardex;
    JMenuItem mniModificaKardex;
    JMenuItem mniEliminaKardex;
    JMenuItem mniBuscaKardex;
    JMenuItem mniListaKardex;
    JMenu mnProducto;
    JMenuItem mniNuevoProducto;
    JMenuItem mniModificaProducto;
    JMenuItem mniEliminaProducto;
    JMenuItem mniBuscaProducto;
    JMenuItem mniListaProducto;
    JMenu mnProveedor;
    JMenuItem mniNuevoProveedor;
    JMenuItem mniModificaProveedor;
    JMenuItem mniEliminaProveedor;
    JMenuItem mniBuscaProveedor;
    JMenuItem mniListaProveedor;
    JMenu mnSalida;
    JMenuItem mniNuevoSalida;
    JMenuItem mniModificaSalida;
    JMenuItem mniEliminaSalida;
    JMenuItem mniBuscaSalida;
    JMenuItem mniListaSalida;
    JMenu mnVendedor;
    JMenuItem mniNuevoVendedor;
    JMenuItem mniModificaVendedor;
    JMenuItem mniEliminaVendedor;
    JMenuItem mniBuscaVendedor;
    JMenuItem mniListaVendedor;
    JMenu mnVenta;
    JMenuItem mniNuevoVenta;
    JMenuItem mniModificaVenta;
    JMenuItem mniEliminaVenta;
    JMenuItem mniBuscaVenta;
    JMenuItem mniListaVenta;
    JDesktopPane dkpEscritorio;

    public FrmMenuPrincipal() {
        dkpEscritorio = new JDesktopPane();
        dkpEscritorio.setBackground(new Color(240, 240, 240));
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniLogin = new JMenuItem("Iniciar Seciòn");
        mniSalir = new JMenuItem("Salir");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
        mnCliente = new JMenu("Cliente");
        mnProveedor = new JMenu("Proveedor");
        mnVendedor = new JMenu("Vendedor");
        mnProducto = new JMenu("Producto");
        mnEntrada = new JMenu("Entrada");
        mnSalida = new JMenu("Salida");
        mnKardex = new JMenu("Kardex");
        mnVenta = new JMenu("Venta");
        mniNuevoCliente = new JMenuItem("Nuevo");
        mniModificaCliente = new JMenuItem("Modificar");
        mniEliminaCliente = new JMenuItem("Eliminar");
        mniBuscarCliente = new JMenuItem("Buscar");
        mniListarCliente = new JMenuItem("Listar");

        mniNuevoProveedor = new JMenuItem("Nuevo");
        mniModificaProveedor = new JMenuItem("Modificar");
        mniEliminaProveedor = new JMenuItem("Eliminar");
        mniBuscaProveedor = new JMenuItem("Buscar");
        mniListaProveedor = new JMenuItem("Listar");

        mniNuevoVendedor = new JMenuItem("Nuevo");
        mniModificaVendedor = new JMenuItem("Modificar");
        mniEliminaVendedor = new JMenuItem("Eliminar");
        mniBuscaVendedor = new JMenuItem("Buscar");
        mniListaVendedor = new JMenuItem("Listar");

        mniNuevoProducto = new JMenuItem("Nuevo");
        mniModificaProducto = new JMenuItem("Modificar");
        mniEliminaProducto = new JMenuItem("Eliminar");
        mniBuscaProducto = new JMenuItem("Buscar");
        mniListaProducto = new JMenuItem("Listar");

        mniNuevoEntrada = new JMenuItem("Nuevo");
        mniModificaEntrada = new JMenuItem("Modificar");
        mniEliminaEntrada = new JMenuItem("Eliminar");
        mniBuscaEntrada = new JMenuItem("Buscar");
        mniListaEntrada = new JMenuItem("Listar");

        mniNuevoSalida = new JMenuItem("Nuevo");
        mniModificaSalida = new JMenuItem("Modificar");
        mniEliminaSalida = new JMenuItem("Eliminar");
        mniBuscaSalida = new JMenuItem("Buscar");
        mniListaSalida = new JMenuItem("Listar");

        mniNuevoKardex = new JMenuItem("Nuevo");
        mniModificaKardex = new JMenuItem("Modificar");
        mniEliminaKardex = new JMenuItem("Eliminar");
        mniBuscaKardex = new JMenuItem("Buscar");
        mniListaKardex = new JMenuItem("Listar");

        mniNuevoVenta = new JMenuItem("Nuevo");
        mniModificaVenta = new JMenuItem("Modificar");
        mniEliminaVenta = new JMenuItem("Eliminar");
        mniBuscaVenta = new JMenuItem("Buscar");
        mniListaVenta = new JMenuItem("Listar");

        mnCliente.add(mniNuevoCliente);
        mnCliente.add(mniModificaCliente);
        mnCliente.add(mniEliminaCliente);
        mnCliente.addSeparator();
        mnCliente.add(mniBuscarCliente);
        mnCliente.add(mniListarCliente);
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnCliente);
        mnbPrincipal.add(mnProveedor);
        mnbPrincipal.add(mnVendedor);
        mnbPrincipal.add(mnProducto);
        mnbPrincipal.add(mnEntrada);
        mnbPrincipal.add(mnSalida);
        mnbPrincipal.add(mnKardex);
        mnbPrincipal.add(mnVenta);
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);

        mnProveedor.add(mniNuevoProveedor);
        mnProveedor.add(mniModificaProveedor);
        mnProveedor.add(mniEliminaProveedor);
        mnProveedor.addSeparator();
        mnProveedor.add(mniBuscaProveedor);
        mnProveedor.add(mniListaProveedor);

        mnVendedor.add(mniNuevoVendedor);
        mnVendedor.add(mniModificaVendedor);
        mnVendedor.add(mniEliminaVendedor);
        mnVendedor.addSeparator();
        mnVendedor.add(mniBuscaVendedor);
        mnVendedor.add(mniListaVendedor);

        mnProducto.add(mniNuevoProducto);
        mnProducto.add(mniModificaProducto);
        mnProducto.add(mniEliminaProducto);
        mnProducto.addSeparator();
        mnProducto.add(mniBuscaProducto);
        mnProducto.add(mniListaProducto);

        mnEntrada.add(mniNuevoEntrada);
        mnEntrada.add(mniModificaEntrada);
        mnEntrada.add(mniEliminaEntrada);
        mnEntrada.addSeparator();
        mnEntrada.add(mniBuscaEntrada);
        mnEntrada.add(mniListaEntrada);

        mnSalida.add(mniNuevoSalida);
        mnSalida.add(mniModificaSalida);
        mnSalida.add(mniEliminaSalida);
        mnSalida.addSeparator();
        mnSalida.add(mniBuscaSalida);
        mnSalida.add(mniListaSalida);

        mnKardex.add(mniNuevoKardex);
        mnKardex.add(mniModificaKardex);
        mnKardex.add(mniEliminaKardex);
        mnKardex.addSeparator();
        mnKardex.add(mniBuscaKardex);
        mnKardex.add(mniListaKardex);

        mnVenta.add(mniNuevoVenta);
        mnVenta.add(mniModificaVenta);
        mnVenta.add(mniEliminaVenta);
        mnVenta.addSeparator();
        mnVenta.add(mniBuscaVenta);
        mnVenta.add(mniListaVenta);

        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     public void mniSalirActionPerformed(ActionEvent e) {
        System.exit(0);
    }
     public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
//        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.EmeraldDuskSkin"); 
//        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme"); 
        FrmMenuPrincipal frmMEnu = new FrmMenuPrincipal();
        frmMEnu.setVisible(true);

    }

}
