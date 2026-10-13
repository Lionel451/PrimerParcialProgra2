package sistematransporteturistico;

import sistematransporteturistico.Vehiculo;

public class LanchaTuristica extends Vehiculo {
    private String tipoMotor;
    
    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, String tipoMotor) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void realizarServicioTuristico() {
        System.out.println("Realizando paseo turistico con colectivo turistico."
                + "\nPatente: " + this.patente
                + "\nMarca: " + this.marca
                + "\nCapacidad maxima de pasajeros: " + this.capacidadPasajeros
                + "\nConbustible del motor: " + this.tipoMotor);
    }
    
}
