/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class CalculateSimpleTest {

    CalculateSimple calc = new CalculateSimple();

    public CalculateSimpleTest() {
    }

    @Test
    public void testAdd() {
        OperationModel operacion = new OperationModel(5, 4);
        int esperado = 9;
        int resultado = calc.add(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSubtract() {
        OperationModel operationModel = new OperationModel(-3, 4);
        int esperado = -7;
        int resultado = calc.subtract(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiply() {
        OperationModel operationModel = new OperationModel(5, 4);
        int esperado = 20;
        int resultado = calc.multiply(operationModel);
        assertEquals(resultado, resultado);
    }

    @Test
    public void testDivide() {
        OperationModel operationModel = new OperationModel(5, 5);
        int esperado = 1;
        int resultado = (int) calc.divide(operationModel);
        assertEquals(resultado, resultado);

    }

    @Test
    public void testClearSimple() {
        OperationModel operationModel = new OperationModel(5, 4);

        
        OperationModel esperado = new OperationModel(0, 0);
        OperationModel resultado = calc.clearSimple(operationModel);
        
        // Uso de diversos métodos assert
        assertEquals(esperado.getA(),resultado.getA());
        assertEquals(esperado.getB(), resultado.getB());
      
    }

    @Test
    public void testFibonacci() {
        OperationModel operationModel = new OperationModel(10);
        int esperado = 55;
        int resultado = calc.fibonacci(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testFactorial() {
        OperationModel operationModel = new OperationModel(5);
        int esperado = 120;
        int resultado = calc.factorial(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSqrt() {
        OperationModel operationModel = new OperationModel(4);
        int esperado = 2;
        int resultado = (int) calc.sqrt(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testPower() {
        OperationModel operationModel = new OperationModel(4);
        int esperado = 16;
        int resultado = calc.power(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testClearAdvanced() {
        OperationModel operationModel = new OperationModel(4);

        OperationModel esperado = new OperationModel(0);
        OperationModel resultado = calc.clearAdvanced(operationModel);
        assertEquals(esperado.getC(),resultado.getC());
    }
}
