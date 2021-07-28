/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Hp
 */
public class BuscarMinimoMaximoTest {
    
    BuscarMinimoMaximo utils = new BuscarMinimoMaximo();
    public BuscarMinimoMaximoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        utils = new BuscarMinimoMaximo();
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void buscaMinimoMaximoTestNum1(){
        List<Integer> lista;
        lista = Arrays.asList(3,2,1,55,2,4,8,20);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(1,55);
        
        assertThat(resultado,Matchers.equalTo(esperado));
    }
    
    @Test
    public void buscaMinimoMaximoTestNum2(){
        List<Integer> lista = Arrays.asList(3,2,1,-250,2,4,-8,100);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(-250,100);
        assertThat(resultado,Matchers.equalTo(esperado));
        
    }
    @Test
    public void buscaMinimoMaximoTestNum3(){
       List<Integer> lista = Arrays.asList(3,1,-2150,2,4,1810);
        MinimoMaximo resultado = utils.buscaMinimoMaximo(lista);
        MinimoMaximo esperado = new MinimoMaximo(-2150,1810);
        assertThat(resultado,Matchers.equalTo(esperado));
    
    }
    
}
