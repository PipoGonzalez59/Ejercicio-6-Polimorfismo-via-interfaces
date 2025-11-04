public class ValvulaRiego extends Dispositivo implements Accionable {
    private String tipo;

    public ValvulaRiego(int id, String nombre, double consumo, String tipo) {
        super(id, nombre, consumo);
        this.tipo = tipo;
    }

    @Override
    // Abre o cierra el flujo de agua (simulado)
    public void ejecutarAccion() {
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}
