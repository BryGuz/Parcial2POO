/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgalery;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String name;
    private String descripcion;
    private String Estilo;
    private double valor;

    public Obra(String name, String descripcion, String Estilo, double valor) {
        this.name = name;
        this.descripcion = descripcion;
        this.Estilo = Estilo;
        this.valor = valor*(0.2);
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return Estilo;
    }

    public double getValor() {
        return valor;
    }
    
    
}
