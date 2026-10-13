package sistematransporteturistico;

import sistematransporteturistico.Vehiculo;

public class VanEjecutiva extends Vehiculo {
    private boolean aireAcondicionado;
    
    public VanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, boolean aireAcondicionado) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void realizarServicioTuristico() {
        System.out.println("Realizando paseo turistico con Van ejecutiva."
                + "\nPatente: " + this.patente
                + "\nMarca: " + this.marca
                + "\nCapacidad maxima de pasajeros: " + this.capacidadPasajeros);
        
        if (aireAcondicionado){
            System.out.println("Tiene aire acondicionado.");
        } else{
            System.out.println("No tiene aire acondicionado.");
        }
        
    }
    
}
