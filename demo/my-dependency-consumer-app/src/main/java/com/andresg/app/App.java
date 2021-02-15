package com.andresg.app;

import com.andresg.model.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Persona per = new Persona();
        per.setId(1);
        per.setNombres("AndresG");
        per.setEdad(40);
        //System.out.println(per.getId() + " " + per.getNombres());
        System.out.println(per.toString());
    }
}
