/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Rasta
 */
public abstract class Nave {
    
    private int id;
    private String nombre;
    private String fechaini;
    private String fechafin;
    private String combustible;
    private String tipo;
    private String pais;
    
    
    public abstract void Ponertipo(int t);
    public abstract void Ponercombustible(int t);

    
    
}
