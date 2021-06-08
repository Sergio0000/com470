/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumComplejoTest {

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {-1, -4, 4, 5},
            {0, 0, 2, 5},
            {2, 3, 5, 6},
            {-1, 0, 2, 5},
            {0, 0, 0, 0},
            {2, -3, 5, 6},
            {0, 5, -2, 5},
            {1, 3, 8, -6},
            {5, 3, -1, -2},
            {4, 7, 0, 0}});
    }

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int bi;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public int di;

    @Test
    public void testSumar() {
        NumComplejo complejo1 = new NumComplejo(a, bi);
        NumComplejo complejo2 = new NumComplejo(c, di);
        NumComplejo resultado = complejo1.sumar(complejo2);
        NumComplejo esperado = new NumComplejo(a + c, bi + di);

        assertEquals(resultado.getParteReal(), esperado.getParteReal());
        assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
    }

    @Test
    public void testRestar() {
        NumComplejo complejo1 = new NumComplejo(a, bi);
        NumComplejo complejo2 = new NumComplejo(c, di);
        NumComplejo resultado = complejo1.restar(complejo2);
        NumComplejo esperado = new NumComplejo(a - c, bi - di);

        assertEquals(resultado.getParteReal(), esperado.getParteReal());
        assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
    }
}
