/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo21 {

    public static void main(String[] args) {

        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double promedio;
        String miNombre;
        String ciudad;
        int edad;

        System.out.println("Ingrese el nombre por favor:");
        miNombre = entrada.nextLine();

        System.out.println("Ingrese el promedio por favor:");
        promedio = entrada.nextDouble();

        System.out.println("Ingrese su edad por favor:");
        edad = entrada.nextInt();

        entrada.nextLine(); // Limpiar el salto de línea

        System.out.println("Ingrese su ciudad por favor:");
        ciudad = entrada.nextLine();

        if (promedio >= 7.5) {

            System.out.printf(
                "Estudiante %s (%s - %d años) aprobado con un promedio de: %.1f\n",
                miNombre, ciudad, edad, promedio
            );

        } else {

            System.out.printf(
                "Estudiante %s (%s - %d años) reprobado con un promedio de: %.1f\n",
                miNombre, ciudad, edad, promedio
            );

        }

    }
}
