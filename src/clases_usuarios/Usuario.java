package clases_usuarios;
import java.util.*;
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fecha_nacimiento;
    private String numero_telefono;
    private String sexo;
    private int id;
    private String nick;
    private String contrasena;
    
    
    
    public Usuario(String nombre,String apellido1,String apellido2,Date fecha_nacimiento,String numero_telefono,String sexo,int id,String nick,String contrasena){
        this.nombre= nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fecha_nacimiento=fecha_nacimiento;
        this.numero_telefono=numero_telefono;
        this.sexo=sexo;
        this.nick=nick;
        this.id=id;
        this.contrasena=contrasena;
        
    }
    
    public void consultar_cita(){
        
    }
    public void acceder_calculadora(){
        
    }
    public void ver_pisos_ventas(){
        
    }
    public void ver_pisos_alquiler(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
