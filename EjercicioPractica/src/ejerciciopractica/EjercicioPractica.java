/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractica;

import java.util.Scanner;
import porcentaje.*;
/**
 *
 * @author rober
 */
public class EjercicioPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //  declaracion de variables
        double matriculaFinal;
        double matriculaInicial = 1330;
        int proviene;
        int edad;
        int estado;
        int carga;
        System.out.println("Ingrese de donde proviene:\n1.- Zamora/Loja \n2.- Otro");
        proviene = entrada.nextInt();
        //  ingreso y lectura de datos
        if (proviene == 1){
         matriculaFinal = matriculaInicial - Porcentaje.porcentaje1;
          } else {
            matriculaFinal = matriculaInicial;
            }
        System.out.println("Ingrese su edad porfavor: ");
        edad = entrada.nextInt();
       if (edad >= 17 && edad < 20){
         matriculaFinal = matriculaFinal - Porcentaje.porcentaje2;
       }
        System.out.println("Ingrese su estado civil: \n1.-Casado\n2.-Otro ");
        estado = entrada.nextInt();
        if (estado == 1){
          matriculaFinal = matriculaFinal - Porcentaje.porcentaje3;
        }
        System.out.println("Usted consta con cargas familiares?\n1.-Si\n2.-2No");
        carga = entrada.nextInt();
        if(carga == 1){
        matriculaFinal = matriculaFinal - Porcentaje.porcentaje4;
       }
       matriculaFinal = matriculaFinal + (matriculaFinal*0.02);
       //  Salida de datos
        System.out.printf("El total a pagar por su matricula es de: %.2f",matriculaFinal);
    }
}  

