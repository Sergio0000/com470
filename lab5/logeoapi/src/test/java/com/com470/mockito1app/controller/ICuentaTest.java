/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.mockito1app.controller;

import com.com470.mockito1app.service.GestorLogin;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.never;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Hp
 */
public class ICuentaTest {

    private IRepositorioCuentas repo;

    ICuenta cuenta;

    //2hacer injecion de lo que hacemos en la clase
    // @InjectMocks
    //private IRepositorioCuentas repo;
    /*
    public BookControllerTest() {
    }
     */
    //Inicializar 
    /*
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }*/
    @Before
    public void inicializarTest() {
        repo = Mockito.mock(IRepositorioCuentas.class);
        cuenta = Mockito.mock(ICuenta.class);
        Mockito.when(repo.buscar("pepe")).thenReturn(cuenta);
    }

    @Test
    public void testAccesoConcedidoALaPrimera() {
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1234");
        Mockito.verify(cuenta).entrarCuenta();
    }

    @Test
    public void testAccesoDenegadoALaPrimera() {
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(false);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1234");
        Mockito.verify(cuenta, never()).entrarCuenta();
    }

    @Test(expected = ExcepcionUsuarioDesconocido.class)
    public void testUsuarioIncorrecto() {
        Mockito.when(repo.buscar("bartolo")).thenReturn(null);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("bartolo", "1234");
        Mockito.verify(cuenta, never()).entrarCuenta();
    }

    @Test
    public void testBloquearTrasTresIntentos() {
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(false);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1234");
        login.acceder("pepe", "1234");
        login.acceder("pepe", "1234");
        Mockito.verify(cuenta, never()).entrarCuenta();
        Mockito.verify(cuenta).bloquearCuenta();
    }

    @Test
    public void testAccederTrasDosIntentos() {
        Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1242");
        login.acceder("pepe", "1234");
        //  Mockito.verify(cuenta, never()).();
        Mockito.verify(cuenta).entrarCuenta();
    }

    @Test
    public void testAccederTrasUnIntentos() {
        // Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
        GestorLogin login = new GestorLogin(repo);
        //  login.acceder("pepe", "1242");
        login.acceder("pepe", "1234");
        //  Mockito.verify(cuenta, never()).();
        Mockito.verify(cuenta).entrarCuenta();
    }

    @Test
    public void testAccederTrasCuatroIntentos() {
        Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);
        Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);
        Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1242");
        login.acceder("pepe", "1234");
        //  Mockito.verify(cuenta, never()).();
        Mockito.verify(cuenta).entrarCuenta();
    }

    @Test
    public void testAccesoDenegadoCuentaBloqueada() {
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
          Mockito.when(cuenta.estaBloqueada()).thenReturn(true);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1234");
        Mockito.verify(cuenta, never()).entrarCuenta();
       // Mockito.verify(cuenta).bloquearCuenta();
    }

    @Test (expected = ExcepcionCuentaEnUso.class)
    public void testCuentaEnUso() {
        Mockito.when(cuenta.claveCorrecta("1234")).thenReturn(true);
        Mockito.when(cuenta.estaEnUso()).thenReturn(true);
        Mockito.when(cuenta.claveCorrecta(anyString())).thenReturn(false);

        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1242");
       // Mockito.verify(cuenta).entrarCuenta();
    }
}
