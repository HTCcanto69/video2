/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hermes
 */
public class Hot {

    public static void main(String[] args) {
        List<PERSONA> lis_nombres= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
         PERSONA PER= new PERSONA();
        PER.setCodigo(1);
        PER.setEdad(25+i);
        PER.setApellido("Nuñez"+i);
        PER.setNombre("Pablo"+i);
        lis_nombres.add(PER);   
        }
        for (PERSONA p : lis_nombres) {
            System.out.println("Codigo: "+ p.getCodigo());
            System.out.println("Edad: "+ p.getEdad());
            System.out.println("Apellido: "+ p.getApellido());
            System.out.println("Nombre: "+ p.getNombre());
        
        }
        }
}
