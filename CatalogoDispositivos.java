import java.util.ArrayList;
import java.util.Collections;

public class CatalogoDispositivos {
    private ArrayList<Dispositivo> dispositivos;

    public CatalogoDispositivos() {
        dispositivos = new ArrayList<>();
    }

    public void inicializarDispositivos() {
        dispositivos.add(new SensorSuelo(1, "Sensor de Humedad", 15.5, "Humedad"));
        dispositivos.add(new EstacionMeteorologica(2, "Estación Norte", 50.0, "Clima"));
        dispositivos.add(new DronRiego(3, "Dron Riego A", 120.3, "Riego"));
        dispositivos.add(new ValvulaRiego(4, "Válvula Sector 1", 20.1, "Válvula"));
        dispositivos.add(new CamaraMultiespectral(5, "Cámara Aérea", 80.0, "Multiespectral"));
        dispositivos.add(new SensorSuelo(6, "Sensor de PH", 10.2, "pH"));
        dispositivos.add(new EstacionMeteorologica(7, "Estación Sur", 52.5, "Clima"));
        dispositivos.add(new DronRiego(8, "Dron Riego B", 122.8, "Riego"));
        dispositivos.add(new ValvulaRiego(9, "Válvula Sector 2", 21.4, "Válvula"));
        dispositivos.add(new CamaraMultiespectral(10, "Cámara Campo 2", 78.9, "Multiespectral"));
    }

    public void agregarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public Dispositivo buscarPorID(int id) {
        for (Dispositivo d : dispositivos) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    public Dispositivo buscarPorNombre(String nombre) {
        for (Dispositivo d : dispositivos) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                return d;
            }
        }
        return null;
    }

    public void ordenarPorConsumo() {
        Collections.sort(dispositivos);
    }
}
