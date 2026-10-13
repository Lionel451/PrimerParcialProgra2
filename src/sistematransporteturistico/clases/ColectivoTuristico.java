package sistematransporteturistico.clases;

import sistematransporteturistico.clases.Vehiculo;

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

    public void setCantidadPisos(int cantidadPisos) {
        if(cantidadPisos < 1 || cantidadPisos > 2){
            throw new IllegalArgumentException("Error. Solo puede tener 1 o 2 pisos.");
        }
        
        this.cantidadPisos = cantidadPisos;
    }
    
    @Override
    public String toString(){
        return "Colectivo Turistico ->" + super.toString() +
                "Pisos: " + this.cantidadPisos;
    }
    
    
}
