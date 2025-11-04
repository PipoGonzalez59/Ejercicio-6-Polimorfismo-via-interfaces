public class EstacionMeteorologica extends Dispositivo implements Medible, Registrable {
    private String tipo;
    private String dato;

    public EstacionMeteorologica(int id, String nombre, double consumo, String tipo) {
        super(id, nombre, consumo);
        this.tipo = tipo;
        this.dato = "";
    }

    @Override
    public double medir() {
        return Math.random() * 35 + 5; // Ejemplo: temperatura simulada
    }

    @Override
    public void registrarDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo + " | Dato climático: " + dato;
    }
}
