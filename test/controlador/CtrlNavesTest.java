/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rasta
 */
public class CtrlNavesTest {
    
    public CtrlNavesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of iniciar method, of class CtrlNaves.
     */
    @Test
    public void testIniciar() {
        System.out.println("iniciar");
        CtrlNaves instance = null;
        instance.iniciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class CtrlNaves.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        CtrlNaves instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCargas method, of class CtrlNaves.
     */
    @Test
    public void testBuscarCargas() {
        System.out.println("buscarCargas");
        int id = 0;
        CtrlNaves instance = null;
        instance.buscarCargas(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLan method, of class CtrlNaves.
     */
    @Test
    public void testBuscarLan() {
        System.out.println("buscarLan");
        int id = 0;
        CtrlNaves instance = null;
        instance.buscarLan(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCargas method, of class CtrlNaves.
     */
    @Test
    public void testMostrarCargas() {
        System.out.println("mostrarCargas");
        int i = 0;
        CtrlNaves instance = null;
        instance.mostrarCargas(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrar method, of class CtrlNaves.
     */
    @Test
    public void testFiltrar() {
        System.out.println("filtrar");
        int t = 0;
        String r = "";
        CtrlNaves instance = null;
        instance.filtrar(t, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarLanzaderas method, of class CtrlNaves.
     */
    @Test
    public void testMostrarLanzaderas() {
        System.out.println("mostrarLanzaderas");
        CtrlNaves instance = null;
        instance.mostrarLanzaderas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstado method, of class CtrlNaves.
     */
    @Test
    public void testCambiarEstado() {
        System.out.println("cambiarEstado");
        int id = 0;
        CtrlNaves instance = null;
        instance.cambiarEstado(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarEstado method, of class CtrlNaves.
     */
    @Test
    public void testConfirmarEstado() {
        System.out.println("confirmarEstado");
        int id = 0;
        CtrlNaves instance = null;
        String expResult = "";
        String result = instance.confirmarEstado(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class CtrlNaves.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        CtrlNaves instance = null;
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
