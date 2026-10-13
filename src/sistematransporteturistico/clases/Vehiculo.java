package sistematransporteturistico.clases;

import java.util.Scanner;
import java.time.Year;
import java.util.Comparator;



public abstract class Vehiculo implements Comparable<Vehiculo>{
    protected String patente;
    protected String marca;
    protected int capacidadPasajeros;
    protected int anioFabricacion;
    
    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setPatente(String patente) {
        patente = patente.trim();
        Scanner input = new Scanner(System.in);
        
        while(patente == ""){
            System.out.println("Error. La patente no puede estar vacia o ya existe."
                    + "\nIngrese nuevamente la patente:");
            patente = input.nextLine();
        }
        
        this.patente = patente;
    }

    public void setMarca(String marca) {
        marca = marca.trim();
        
        Scanner input = new Scanner(System.in);
        while(marca == ""){
            System.out.println("Error. La marca no puede estar vacia."
                    + "\nIngrese nuevamente la marca:");
            marca = input.nextLine();
        }
                
        this.marca = marca;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if (capacidadPasajeros <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        
        this.capacidadPasajeros = capacidadPasajeros;   
    }

    public void setAnioFabricacion(int anioFabricacion) {
        int anioActual = Year.now().getValue();

        if (anioFabricacion <= 1990 || anioFabricacion > anioActual) {
            throw new IllegalArgumentException("Error. El año debe ser mayor que 1990 y menor que " + anioActual + ".");
        }
        this.anioFabricacion = anioFabricacion;
    }
    
    public abstract void realizarServicioTuristico();
    
    @Override
    public String toString(){
        return "Patente: " + this.patente +
                "\nMarca: " + this.marca +
                "\nCapacidad de pasajeros: " + this.capacidadPasajeros +
                "\nAño de Facricacion: " + this.anioFabricacion;
    }
    
    @Override
        public int compareTo(Vehiculo otro) {
        return this.patente.compareTo(otro.patente);
}
    
    public int compareToPatente(String otraPatente){
        return this.patente.compareTo(otraPatente);
    }
    
    public int compareToAnio(Vehiculo otro) {
        return Integer.compare(otro.anioFabricacion, this.anioFabricacion);
    }
    
    public int compareToCapacidad(Vehiculo otro) {
        return Integer.compare(otro.capacidadPasajeros, this.capacidadPasajeros);
    }
    
}
