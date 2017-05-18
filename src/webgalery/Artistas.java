/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgalery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artistas extends Persona{
    private String Curriculum;
    private ArrayList<Obra> Obras;
    
    public Artistas(String nombre, String apellido, String Curriculum) {
        super(nombre, apellido);
        this.Curriculum = Curriculum;
         this.Obras = new ArrayList<>();
       
    }
    
      public void AgregarObras(Obra o){
        this.Obras.add(o);
    }
     public ArrayList<Obra> ListarObras(){
        return this.Obras;
    }

    public String getCurriculum() {
        return Curriculum;
    }

  


    
}
