package com.gamis214;


public class Celular {

    String nombre,color;

    public Celular(){

    }

    public Celular(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public void llamar(){
        System.out.println("Llamando de "+nombre+" Color: "+color);
    }

    public void llamarEspecial(Celular celular){
        System.out.println("Nombre: " + celular.nombre + "\nColor:" + celular.color );
    }
}
