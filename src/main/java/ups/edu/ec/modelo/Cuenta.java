/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author user
 */
public class Cuenta {
    private int codigo;
    private double valor;
    private String nombre;

    public Cuenta(int codigo, double valor, String nombre) {
        this.codigo = codigo;
        this.valor = valor;
        this.nombre = nombre;
    }

   
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", valor=" + valor + ", nombre=" + nombre + '}';
    }
    
    
}
