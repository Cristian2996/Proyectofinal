/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.entidades;

import java.util.Date;

/**
 *
 * @author CRISTIAN
 */
public class Entrada {
    private int codigoE;
    private Date fecha_ingreso;
    private Proveedor proveedor;
    private int factura;
    private Date fecha_factura;
    private String vendedor;

    public Entrada() {
    }

    public Entrada(int codigoE, Date fecha_ingreso, Proveedor proveedor, int factura, Date fecha_factura, String vendedor) {
        this.codigoE = codigoE;
        this.fecha_ingreso = fecha_ingreso;
        this.proveedor = proveedor;
        this.factura = factura;
        this.fecha_factura = fecha_factura;
        this.vendedor = vendedor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(int codigoE) {
        this.codigoE = codigoE;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }
    
}
