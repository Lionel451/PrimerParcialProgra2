package sistematransporteturistico.clases;

import java.util.Comparator;

public class ComparadorPorCapacidad implements Comparator<Vehiculo>{
    
    @Override
    public int compare(Vehiculo a, Vehiculo b) {
        return a.compareToCapacidad(b);
    }
    
}
