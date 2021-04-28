/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_usuarios;

import java.util.Date;

public class Jefe extends Usuario {
    private final int id_jefe;
    private int ventas;
    
    public Jefe(String nombre, String apellido1,String apellido2, Date fecha_nacimiento, String numero_telefono, String sexo, int id, String nick, String contrasena, int id_jefe,int ventas) {
        super(nombre, apellido1,apellido2, fecha_nacimiento, numero_telefono, sexo, id, nick, contrasena);
        this.id_jefe=id_jefe;
        this.ventas=ventas;
    }
    
    public void add_empleado(){
        
    }
    
    public void add_ventas(){
        
    }
    
    public void consulta_BD(String consulta){
        
    }
    @Override
    public void consultar_cita(){
        
    }
    @Override
    public void acceder_calculadora(){
        
    }
    public void delete_empleado(){
        
    }
    public void add_vivienda(){
        
    }
    public void delete_vivienda(){
        
    }
    public void mod_vivienda(){
        
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
    
   
    
}