package MiPrimerProgramaEclipse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioXd {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //Creando objeto para leer la entrada de datos 
        //Variables
        int opcion;
        //Variables del caso 1
        String nomProducto;
        int cantProducto;
        double precioProducto, totalPrecio, totalPago, iva;
        
        //Variables del caso 2
        int numNombres; //Tamaño del arreglo
        String nombres[]; //Variable del arreglo
        String aux;
        nombres = null;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1.EJERCICIO DE COMPRA");
            System.out.println("2.EJERCICIO DE ARREGLO Y ORDENAMIENTO");
            System.out.println("3.EJERCICIO PARA GUARDAR ARCHIVOS");
            System.out.println("4.SALIR");
            System.out.println("--------------------------------------");
            System.out.println("Elija una de las siguientes opciones");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del producto a comprar");
                    nomProducto = entrada.nextLine();

                    System.out.println("Ingrese la cantidad del producto");
                    cantProducto = entrada.nextInt();
                    entrada.nextLine(); 

                    while (cantProducto > 10 || cantProducto <= 0) {
                        System.out.println("Error, el rango de la cantidad es de (1-10)");
                        cantProducto = entrada.nextInt();
                        entrada.nextLine(); 
                    } 

                    System.out.println("Ingrese el precio del producto");
                    precioProducto = entrada.nextDouble();
                    entrada.nextLine(); 

                    while (precioProducto > 10 || precioProducto <= 0) {
                        System.out.println("Error, el rango del precio es de (1-10)");
                        precioProducto = entrada.nextDouble();
                        entrada.nextLine(); 
                    }

                    totalPrecio = cantProducto * precioProducto;
                    iva = totalPrecio * 0.15;
                    totalPago = totalPrecio + iva;

                    System.out.println("El total a pagar es de: " + totalPago);

                    break;
                }
                case 2: {
                	System.out.println("Ingrese n nombres");
                    numNombres = entrada.nextInt();
                    
                    nombres = new String[numNombres];
                    entrada.nextLine();
                    
                    for (int i=0; i<numNombres; i++) {
                        System.out.println("Ingrese los nombres");
                        nombres[i] = entrada.nextLine();
                    }
                    //Nombres ingresados en el arreglo
                    for (int i=0; i<numNombres; i++){
                        System.out.println("Los nombres ingresados son: "+nombres[i]);
                    }
                    //Ordenamiento burbuja 
                    for (int i=0; i<(numNombres-1); i++){
                        for (int j=0; j<(numNombres-1); j++){
                            if (nombres[j].compareTo(nombres[j+1])>0) {
                                aux = nombres[j];
                                nombres[j] = nombres[j+1];
                                nombres[j+1] = aux;
                            }
                        }
                    }
                    //Muestra ascendente de los nombres ordenados
                    for (int i=0; i<numNombres; i++){
                        System.out.println("--------------------------------------");
                        System.out.println("Los nombres ordenados son: "+nombres[i]);
                        System.out.println("--------------------------------------");
                    }
                    break;
                }
                case 3: {
                    try {
                        FileWriter writer = new FileWriter("Nombres.txt");
                        //Guardar los nombres ingresados en el arreglo 
                        for (String name: nombres) {
                            writer.write(name+"/n");
                        }
                        writer.close();
                        System.out.println("El archivo se ha guardado correctamente");
                    }catch(IOException e) {
                        System.out.println("Error, archivo no guardado"+ e.getMessage());
                    }
                    
                    break;
                }
                case 4: {
                    System.out.println("Ha salido con exito...");
                    break;
                }
                default: {
                    System.out.println("Opcion invalida, intente nuevamente....");
                    break;
                }
            }
        }while(opcion!=4);

	}

}
