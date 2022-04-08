/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario;

/**
 *
 * @author FRIDA KALO
 */
public class Alumno {

private String numerodecuenta;
private String nomnbre;

 public Alumno(){
}

    public Alumno(String numerodecuenta, String nomnbre) {
        this.numerodecuenta = numerodecuenta;
        this.nomnbre = nomnbre;
    }
        
public void setNumerodecuenta(String numerodecuenta){
this.numerodecuenta = numerodecuenta;
}
public void setNombre(String nombre){
this.nomnbre = nombre;

}

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public String getNomnbre() {
        return nomnbre;
    }
}
