/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.entidades;
public class Cliente {
    private int codigoC;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;
    private String sexo;

    public Cliente() {
    }

    public Cliente(int codigoC, String nombre, String apellido, String cedula, String direccion, String telefono, String sexo) {
        this.codigoC = codigoC;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}