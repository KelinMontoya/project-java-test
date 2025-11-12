package com.example.ProjectJavaTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project Java Test - Estructura básica");
        // Bloque: enteros
        int a = 8;
        int b = 3;
        System.out.println("Enteros: a=" + a + ", b=" + b);
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println();

        // Bloque: punto flotante
        double x = 3.14;
        float y = 2.5f;
        System.out.println("Double x = " + x + ", Float y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println();

        // Bloque: cadenas
        String nombre = "Victor";
        String saludo = "Hola, " + nombre + "!";
        System.out.println(saludo);
        System.out.println("Longitud de nombre: " + nombre.length());
        System.out.println("Mayúsculas: " + nombre.toUpperCase());
        System.out.println();

        // Bloque: operadores de asignación e incremento
        int n = 5;
        n += 3; // n = 8
        System.out.println("Operador += : " + n);
        n++;
        System.out.println("Post-incremento: " + n);
        ++n;
        System.out.println("Pre-incremento: " + n);
        System.out.println();

        // Bloque: conversión de temperatura (usa la clase TemperatureConverter)
        double[] samples = {32, 0, 100, 212, 98.6};
        for (double val : samples) {
            double c = TemperatureConverter.fahrenheitToCelsius(val);
            System.out.printf("%.1f °F -> %.2f °C%n", val, c);
        }
    }
}
