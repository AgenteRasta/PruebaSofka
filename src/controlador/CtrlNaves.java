/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Consultas;
import modelo.Lanzadera;
import modelo.Nave;
import modelo.Naves;
import vista.Vista;

/**
 *
 * @author Rasta
 */
public class CtrlNaves extends Conexion implements ActionListener{
    
    private Naves mod;
    private Consultas modC;  
    private Vista frm;
    private Statement st=null,st1=null;
    private ResultSet rs=null, rs1=null;
    private Lanzadera mod1;
    
    public CtrlNaves (Naves mod, Lanzadera mod1, Consultas modC, Vista frm){
        
        this.mod=mod;
        this.mod1=mod1;
        this.modC=modC;
        this.frm=frm;
        this.frm.btnRegistrar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        this.frm.btnBuscar1.addActionListener(this);
        this.frm.btnRegistrar1.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnModificar1.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnLimpiar1.addActionListener(this);
        this.frm.btnMcargas.addActionListener(this);
        this.frm.btnMcargas1.addActionListener(this);
        this.frm.btnMlanzaderas.addActionListener(this);
        this.frm.btnFiltro.addActionListener(this);

    }
    
    public void iniciar(){
        frm.setTitle("Naves");
        frm.setLocationRelativeTo(null);
        //frm.txtId.setVisible(false);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //INICIO DE ASIGNACION DE BOTONES
        
        if(e.getSource()==frm.btnRegistrar){
            
            mod.setNombre(frm.txtNombre.getText());
            mod.setFechaini(frm.txtFechaini.getText());
            mod.setFechafin(frm.txtFechafin.getText());
            mod.Ponertipo(frm.cbTipo.getSelectedIndex());
            mod.Ponercombustible(frm.cbCombustible.getSelectedIndex());
            mod.setPais(frm.txtPais.getText());
            //mod.setCombustible(frm.txtCombustible.getText());
            
            if(modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar"); 
                
            }
        }
        
        if(e.getSource()==frm.btnRegistrar1){
            String c=confirmarEstado(Integer.parseInt(frm.txtCarga.getText()));
            if(Integer.parseInt(c)==0){
                cambiarEstado(Integer.parseInt(frm.txtCarga.getText()));
                mod1.setNombre(frm.txtNombre.getText());
                mod1.setFechaini(frm.txtFechaini.getText());
                mod1.setFechafin(frm.txtFechafin.getText());
                mod1.Ponercombustible(frm.cbTipo.getSelectedIndex());
                mod1.setIdCarga(Integer.parseInt(frm.txtCarga.getText()));
                mod1.setPais(frm.txtPais.getText());

                if(modC.registrar1(mod1)){
                    JOptionPane.showMessageDialog(null, "Registro Guardado");

                }else{
                    JOptionPane.showMessageDialog(null, "Error al Guardar"); 

                }
            }else{
                JOptionPane.showMessageDialog(null, "La nave de carga ya fue utilizada ");
            }
        }
        
        
        
        if(e.getSource()==frm.btnMcargas){ 
            mostrarCargas(0);
            frm.labelCarga.setText("Cargas dispobibles");
        }
        
        if(e.getSource()==frm.btnMcargas1){ 
            mostrarCargas(1);
            frm.labelCarga.setText("Cargas usadas");
        }
        
        if(e.getSource()==frm.btnMlanzaderas){  
            mostrarLanzaderas();
        }
        if(e.getSource()==frm.btnBuscar){
            buscarCargas(Integer.parseInt(frm.txtBuscar.getText()));
        }
        if(e.getSource()==frm.btnBuscar1){
            buscarLan(Integer.parseInt(frm.txtBuscar1.getText()));
        }
        
        if(e.getSource()==frm.btnModificar){
            
            mod.setId(Integer.parseInt(frm.txtBuscar.getText()));
            mod.setNombre(frm.txtNombre.getText());
            mod.setFechaini(frm.txtFechaini.getText());
            mod.setFechafin(frm.txtFechafin.getText());
            mod.setPais(frm.txtPais.getText());
            
            if(modC.modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar"); 
            }
        }
        
        if(e.getSource()==frm.btnModificar1){
            
            mod1.setId(Integer.parseInt(frm.txtBuscar1.getText()));
            mod1.setNombre(frm.txtNombre.getText());
            mod1.setFechaini(frm.txtFechaini.getText());
            mod1.setFechafin(frm.txtFechafin.getText());
            mod1.setPais(frm.txtPais.getText());
            
            if(modC.modificar1(mod1)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar"); 
            }
        }
        
        if(e.getSource()==frm.btnEliminar){
            mod.setId(Integer.parseInt(frm.txtBuscar.getText()));
            
            if(modC.eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar"); 
            }
        }
        
        if(e.getSource()==frm.btnEliminar1){
            mod1.setId(Integer.parseInt(frm.txtBuscar1.getText()));
            
            if(modC.eliminar1(mod1)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar"); 
            }
        } 
        
        if(e.getSource()==frm.btnLimpiar){
            limpiar();
        }
        
        if(e.getSource()==frm.btnLimpiar1){
            limpiar();
        }
        
        if(e.getSource()==frm.btnFiltro){
            filtrar(frm.cbFiltro.getSelectedIndex(),frm.txtFiltro.getText());
        }
    }
    
    //FIN ASIGNACION DE BOTONES
    
    public void buscarCargas(int id){
        Conexion con=new Conexion();
        Connection cone = con.getConexion();
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM carga  WHERE idnCarga="+id);
            
            if(rs.next()){
                frm.txtNombre.setText((rs.getString(2)));
                frm.txtFechaini.setText((rs.getString(3)));
                frm.txtFechafin.setText((rs.getString(4)));
                frm.txtPais.setText(rs.getString(8));
                //frm.txtCombustible.setText((rs.getString(5)));

            }

        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public void buscarLan(int id){
        Conexion con=new Conexion();
        Connection cone = con.getConexion();
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM lanzaderas  WHERE idLan="+id);
            
            if(rs.next()){
                frm.txtNombre.setText((rs.getString(2)));
                frm.txtFechaini.setText((rs.getString(3)));
                frm.txtFechafin.setText((rs.getString(4)));
                frm.txtPais.setText(rs.getString(7));
                //frm.txtCombustible.setText((rs.getString(5)));

            }

        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public void mostrarCargas(int i){

        Conexion con=new Conexion();
        Connection cone = con.getConexion();
 
        String[] datos=new String[8];
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Fechaini");
        model.addColumn("Fechafin");
        model.addColumn("Combustible");
        model.addColumn("Estado");
        model.addColumn("Tipo");
        model.addColumn("Pais");
        frm.visor.setModel(model);
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM carga  WHERE estadoCarga="+i);
            while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(8);
                    model.addRow(datos);
                
            }
        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }    
    }
    
    public void filtrar(int t,String r){
        String f;
        if(t==0){
            f="paisCarga";
        }else{
            f="combustibleCarga";
        }
        Conexion con=new Conexion();
        Connection cone = con.getConexion();
 
        String[] datos=new String[8];
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Fechaini");
        model.addColumn("Fechafin");
        model.addColumn("Combustible");
        model.addColumn("Estado");
        model.addColumn("Tipo");
        model.addColumn("Pais");
        frm.filtro.setModel(model);
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM carga  WHERE "+f+"='"+r+"'");
            while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(8);
                    model.addRow(datos);
                
            }
        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public void mostrarLanzaderas(){

        Conexion con=new Conexion();
        Connection cone = con.getConexion();
 
        String[] datos=new String[7];
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Fechaini");
        model.addColumn("Fechafin");
        model.addColumn("Combustible");
        model.addColumn("Id carga");
        model.addColumn("Pais");
        
        frm.visor1.setModel(model);
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM lanzaderas");
            while(rs.next()){

                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    model.addRow(datos);
                
            }
        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }    
    }
    
    public void cambiarEstado(int id){
        Conexion con=new Conexion();
        Connection cone = con.getConexion();
        
        try{ 
            st = cone.createStatement();
            st.executeUpdate("UPDATE carga SET estadoCarga=1 WHERE idnCarga="+id);
            
        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public String confirmarEstado(int id){
        Conexion con=new Conexion();
        Connection cone = con.getConexion();
        try{
            st = cone.createStatement();
            rs = st.executeQuery("SELECT * FROM carga  WHERE idnCarga="+id);
            
            if(rs.next()){
                return rs.getString(6);
            }

        }catch(SQLException e){
            System.err.println(e);
            
        }finally{
            try{
                cone.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        return null;
    }
    
    public void limpiar(){
        frm.txtNombre.setText("");
        frm.txtFechaini.setText("");
        frm.txtFechafin.setText("");
        //frm.txtCombustible.setText("");
        frm.txtCarga.setText("");
        frm.txtPais.setText("");
    }
    
}
