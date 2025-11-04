public class DronRiego extends Dispositivo implements Accionable, Registrable {
    private String tipo;
    private String dato;

    public DronRiego(int id, String nombre, double consumo, String tipo) {
        super(id, nombre, consumo);
        this.tipo = tipo;
        this.dato = "";
    }

    @Override 
    // Acción simulada de riego o vuelo
    public void ejecutarAccion() {
    }

    @Override
    public void registrarDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo + " | Registro: " + dato;
    }
}
