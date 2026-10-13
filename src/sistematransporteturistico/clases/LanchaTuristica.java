package sistematransporteturistico.clases;

import sistematransporteturistico.clases.Vehiculo;

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

    public void setTipoMotor(String tipoMotor) {
        String t = tipoMotor.trim().toUpperCase();
        if (!t.equals("NAFTA") && !t.equals("DIESEL") && !t.equals("ELECTRICO")) {
            throw new IllegalArgumentException("Tipo de motor inválido. Use NAFTA, DIESEL o ELECTRICO.");
        }
        this.tipoMotor = tipoMotor;
    }
    
    
    @Override
    public String toString(){
        return "Lancha Turistica ->" + super.toString() +
                "Conbustible del motor: " + this.tipoMotor;
    }
}
