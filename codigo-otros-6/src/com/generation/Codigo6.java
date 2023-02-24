package com.generation;

/* Primero nos genera 20 números aleatorios
 * Todos los números se van a imprimir en consola y
 * solo se mostrarán números a partir del valor 20. 
 * 
 * Se preguntará si desea que se muestren los números
 * que son solo múltiplos de 5 o de 7
 * 
 * Al final a partir de la condicional solo se mostrarán 
 * los valores del múltiplo que se haya elegido. 
*/
public class Codigo6{ //La clase comienza con Mayúscula
	
	  public static void main(String[] args){ //Método main
	    int[] n = new int[20]; //Instanciar con la palabra new

	    for (int i = 0; i < 20; i++) {//"+" faltante en el incremento del ciclo
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//"out" mostrar en consola
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); 
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());//Cerrar con ) faltante

	    int multiplo = (opcion == 1) ? 5 : 7; //Símbolos ? y : invertidos en el operador

	    for (int e : n) {  //Camviamos el tipo de variable y ciclo for
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
        }
	      else {
	        System.out.print(e + " "); //"out" para mostrar en consola
	      }
	    }
	  }
	}