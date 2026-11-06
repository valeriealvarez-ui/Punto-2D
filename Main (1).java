public class Main {

    public static void main(String[] args) {

        // Crear punto en el origen
        Punto punto1 = new Punto();

        System.out.println("Punto 1:");
        punto1.mostrarCoordenadas();

        // Crear punto con coordenadas
        Punto punto2 = new Punto(3.0, 4.0);

        System.out.println("Punto 2:");
        punto2.mostrarCoordenadas();

        // Obtener coordenadas
        System.out.println("Coordenada X: " + punto2.getX());
        System.out.println("Coordenada Y: " + punto2.getY());

        // Modificar coordenadas
        punto2.setX(5.0);
        punto2.setY(6.0);

        System.out.println("Punto modificado:");
        punto2.mostrarCoordenadas();

        // Mover el punto
        punto2.mover(2.0, 3.0);

        System.out.println("Punto después de mover:");
        punto2.mostrarCoordenadas();

        // Calcular distancia
        System.out.println("Distancia desde el origen: "
                + punto2.calcularDistanciaDesdeOrigen());
    }
}
