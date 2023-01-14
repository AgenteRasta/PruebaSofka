/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Rasta
 */
public class Naves extends Nave {
    private int id;
    private String nombre;
    private String fechaini;
    private String fechafin;
    private String combustible;
    private String tipo;
    private int estado;
    private String pais;

    public Naves() {
        this.nombre = nombre;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.estado=0;
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void Ponertipo(int t) {
        if(t==1){
            this.tipo="Naves no tripulada";
        }
        else if(t==2){
            this.tipo="Nave tripulada";
        }
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Naves{" + "id=" + id + ", nombre=" + nombre + ", fechaini=" + fechaini + ", fechafin=" + fechafin + ", combustible=" + combustible + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

    @Override
    public void Ponercombustible(int t) {
        if(t==0){
            this.combustible="Solido";
        }
        else if(t==2){
            this.combustible="Liquido";
        }else if(t==3){
            this.combustible="Ambos";
        }
    }
    
    
    
    
}
