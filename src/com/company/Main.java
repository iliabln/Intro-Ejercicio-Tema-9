
/*
Crea una clase Persona con las siguientes variables:


- La edad.
- El nombre.
- El teléfono.

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.


Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.


Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.edad = 25;
        cliente1.telefono = "654654654";
        cliente1.nombre = "María Jesus";
        cliente1.credito = 28954.32d;

        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 32;
        trabajador1.telefono = "678578456";
        trabajador1.nombre = "Gregorio Dublin";
        trabajador1.salario = 2445.64d;

        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}