package sistematransporteturistico.clases;

import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Vehiculo> {
    
    @Override
    public int compare(Vehiculo a, Vehiculo b) {
        return a.compareToAnio(b);
    }

}
