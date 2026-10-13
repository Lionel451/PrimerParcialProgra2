package sistematransporteturistico;

import sistematransporteturistico.Vehiculo;

public class ColectivoTuristico extends Vehiculo {
    private int cantidadPisos;

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public void realizarServicioTuristico() {
        System.out.println("Realizando paseo turistico con colectivo turistico."
                + "\nPatente: " + this.patente
                + "\nMarca: " + this.marca
                + "\nCapacidad maxima de pasajeros: " + this.capacidadPasajeros
                + "\nCantidad de pisos: " + this.cantidadPisos);
    }
    
    
}
