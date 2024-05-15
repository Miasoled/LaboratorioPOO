package ClasesObjetosMetodos;
//CREACION DE LA CLASE
public class Motos {
	//CREACION DE ATRIBUTOS
	//modificador de acceso publico
	String color;
	String brand; //marca
	float km;
	
	//CREACION DE METODOS 
	public static void main(String[] args) {
		
		Motos motorcycle = new Motos();
		
		//LLENAR LOS ATRIBUTOS AL OBJETO 
		motorcycle.brand = "Thundra";
		motorcycle.color = "Negra";
		motorcycle.km = 1000;
		
		//IMPRIMIENDO 
		System.out.println("La marca de la moto es: "+motorcycle.brand);
		System.out.println("El color de la moto es: "+motorcycle.color);
		System.out.println("El kilometraje de la moto es: "+motorcycle.km);

		Motos motorcycle1 = new Motos();
		motorcycle1.brand = "Kawasaki";
		motorcycle1.color = "Verde";
		motorcycle1.km = 100;
		
		System.out.println("La marca de la moto es: "+motorcycle1.brand);
		System.out.println("La marca de la moto es: "+motorcycle1.color);
		System.out.println("La marca de la moto es: "+motorcycle1.km);
		
	}
}
 
// this.variable = varibale 
/*
	this es una palabra reservada 
	
	metodos 
	public String getvariable
	siempre va a retornar la variable 
	return
	
*/