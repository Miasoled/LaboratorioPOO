package EjercicioPractico;

public class Motos {
	
    private String color;
    private String brand;
    private float kilometraje;

    // Constructor para inicializar los atributos
    public Motos(String color, String brand, float kilometraje) {
        this.color = color;
        this.brand = brand;
        this.kilometraje = kilometraje;
    }

    // Getters y setters para acceder a los atributos
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return brand;
    }

    public void setMarca(String marca) {
        this.brand = marca;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public static void main(String[] args) {
        // Crear objetos de la clase Moto utilizando el constructor
        Motos moto1 = new Motos("Negra", "Thundra", 1000);
        Motos moto2 = new Motos("Verde", "Kawasaki", 100);

        // Imprimir los atributos de los objetos
        System.out.println("La marca de la moto es: " + moto1.getMarca());
        System.out.println("El color de la moto es: " + moto1.getColor());
        System.out.println("El kilometraje de la moto es: " + moto1.getKilometraje());

        System.out.println("-----------------------------------------");
        
        System.out.println("La marca de la moto es: " + moto2.getMarca());
        System.out.println("El color de la moto es: " + moto2.getColor());
        System.out.println("El kilometraje de la moto es: " + moto2.getKilometraje());
        
        System.out.println("-----------------------------------------");
    }
}

