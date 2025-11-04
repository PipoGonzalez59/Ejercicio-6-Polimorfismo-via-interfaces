public abstract class Dispositivo implements Comparable<Dispositivo> {
    private int id;
    private String nombre;
    private double consumoElectrico;
    private boolean estado;

    public Dispositivo(int id, String nombre, double consumoElectrico) {
        this.id = id;
        this.nombre = nombre;
        this.consumoElectrico = consumoElectrico;
        this.estado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumoElectrico() {
        return consumoElectrico;
    }

    public boolean isEncendido() {
        return estado;
    }

    public void setEncendido(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Dispositivo otro) {
        return Double.compare(this.consumoElectrico, otro.consumoElectrico);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Consumo: " + consumoElectrico + "W | Encendido: " + estado;
    }
}
