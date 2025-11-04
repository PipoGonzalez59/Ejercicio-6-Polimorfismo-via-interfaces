import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CatalogoDispositivos catalogo = new CatalogoDispositivos();
        catalogo.inicializarDispositivos();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ DE DISPOSITIVOS AGROTECH ===");
            System.out.println("1. Listar todos los dispositivos");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Ordenar por consumo eléctrico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (Dispositivo d : catalogo.getDispositivos()) {
                        System.out.println(d.toString());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    int id = sc.nextInt();
                    Dispositivo encontrado = catalogo.buscarPorID(id);
                    if (encontrado != null) {
                        System.out.println(encontrado.toString());
                    } else {
                        System.out.println("No se encontró el dispositivo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre a buscar: ");
                    String nombre = sc.nextLine();
                    Dispositivo porNombre = catalogo.buscarPorNombre(nombre);
                    if (porNombre != null) {
                        System.out.println(porNombre.toString());
                    } else {
                        System.out.println("No se encontró el dispositivo.");
                    }
                    break;
                case 4:
                    catalogo.ordenarPorConsumo();
                    System.out.println("Catálogo ordenado por consumo eléctrico.");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
