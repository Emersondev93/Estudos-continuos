package com.algaworks.junit;

import org.junit.*;

public class EntendendoJUnitTest {

    @BeforeClass
    public static void iniciarTestes(){
        System.out.println(">>>public static void iniciarTestes()<<<");
    }

    @AfterClass
    public static void encerrarTestes(){
        System.out.println(">>>public static void encerrarTestes<<<");
    }

    @Test
    public void testandoAlgo(){
        String nome = String.format("%s","Emersoon");

        Assert.assertEquals(nome,"Emerson");
    }

    @Test
    public void testandoOutraCoisa(){
        System.out.println(">>>public void testandoOutraCoisa() <<<");
    }
}
