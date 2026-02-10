package org.example;

import org.example.models.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Teste Aplicação");

       /*
       Person p = new Person();
        p.setId(1);
        p.setName("André");
        p.setTelephone("(16) 9 99998888");
       */
        Employee e = new Employee();
        e.setId(2);
        e.setName("Luiz");
        e.setTelephone("(16) 9 77776666");

      //  System.out.println(p);
        System.out.println(e);
    }
}