/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eteczl.primeiroprojeto;

/**
 *
 * @author Admin
 */
public class aplicacao {
    public static void main (String args[]) {
    System.out.println("meu metodo main rodou");
    
    
    {
        
    System.out.println("meu metodo main rodou");
    Celular c1 = new Celular();
    Celular c2 = new Celular();
    Celular c3 = new Celular();
    c1.marca = "iphone";
    c2.marca = "motorola";
    c3.marca = "sansung";
    System.out.println(c1.marca);
    System.out.println(c2.marca);
    System.out.println(c3.marca);
    
    System.out.println(c1.numModelo);
    System.out.println(c2.numModelo);
    System.out.println(c3.numModelo);
    
    System.out.println("mudando o atributo estatico");
    Celular.numModelo = 11;
    
    System.out.println(c1.numModelo);
    System.out.println(c2.numModelo);
    System.out.println(c3.numModelo);
    }
    }
}
