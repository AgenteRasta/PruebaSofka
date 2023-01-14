/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rasta
 */
public class Consultas extends Conexion {
    
    public boolean registrar(Naves nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO carga (nombreCarga, fechainiCarga, fechafinCarga, tipoCarga, combustibleCarga, estadoCarga, paisCarga) VALUES(?,?,?,?,?,?,?)";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, nave.getNombre());
            ps.setString(2, nave.getFechaini());
            ps.setString(3, nave.getFechafin());
            ps.setString(4, nave.getTipo());
            ps.setString(5, nave.getCombustible());
            ps.setInt(6, nave.getEstado());
            ps.setString(7, nave.getPais());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean registrar1(Lanzadera nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO lanzaderas (nombreLan, fechainiLan, fechafinLan, combustibleLan, idCarga, paisLan) VALUES(?,?,?,?,?,?)";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, nave.getNombre());
            ps.setString(2, nave.getFechaini());
            ps.setString(3, nave.getFechafin());
            ps.setString(4, nave.getCombustible());
            ps.setInt(5, nave.getIdCarga());
            ps.setString(6, nave.getPais());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean modificar(Naves nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE carga SET nombreCarga=?, fechainiCarga=?, fechafinCarga=?, paisCarga=? WHERE idnCarga=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, nave.getNombre());
            ps.setString(2, nave.getFechaini());
            ps.setString(3, nave.getFechafin());
            ps.setString(4, nave.getPais());
            ps.setInt(5,nave.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar1(Lanzadera nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE lanzaderas SET nombreLan=?, fechainiLan=?, fechafinLan=?, paisLan=? WHERE idLan=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, nave.getNombre());
            ps.setString(2, nave.getFechaini());
            ps.setString(3, nave.getFechafin());
            ps.setString(4, nave.getPais());
            ps.setInt(5,nave.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Naves nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM carga WHERE idnCarga=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,nave.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar1(Lanzadera nave){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM lanzaderas WHERE idLan=?";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,nave.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    } 
}
