/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import ups.edu.ec.modelo.Cuenta;

/**
 *
 * @author user
 */
public class ControladorCuenta {

    private ArrayList<Cuenta> lista;

    public ControladorCuenta() {
        lista = new ArrayList();
    }

    public void crear(int codigo, double valor, String nombre) {
        lista.add(new Cuenta(codigo, valor, nombre));
    }

    public void depositar(int codigo, double valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (codigo == lista.get(i).getCodigo()) {
                lista.get(i).setValor(lista.get(i).getValor() + valor);
            }
        }

    }

    public void retiro(int codigo, double valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (codigo == lista.get(i).getCodigo()) {
                lista.get(i).setValor(lista.get(i).getValor() - valor);
            }
        }

    }

    public String show() {
        String val = "";
        for (Cuenta ob : lista) {
            val += ob.toString() + "\n";
        }
        return val;
    }

    public ArrayList<Cuenta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cuenta> lista) {
        this.lista = lista;
    }
    

}
