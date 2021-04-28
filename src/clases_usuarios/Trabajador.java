/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_usuarios;

import java.util.Date;


public class Trabajador extends Usuario {
    
    private final int id_trabajador;
    private int ventas;
    
    public Trabajador(String nombre, String apellido1,String apellido2, Date fecha_nacimiento, String numero_telefono, String sexo, int id, String nick, String contrasena,int id_trabajador,int ventas) {
        super(nombre, apellido1,apellido2, fecha_nacimiento, numero_telefono, sexo, id, nick, contrasena);
        this.id_trabajador=id_trabajador;
        this.ventas=ventas;
    }   
    
    
    
    //Creamos los metodos para las consultas
    public void consulta_BD(String consulta){
        
    }
    
    
    
    private int return_ventas(){
        return ventas;
    }
    @Override
    public void consultar_cita(){
        
    }
    @Override
    public void acceder_calculadora(){
        
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
}