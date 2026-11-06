public class Punto {

    // Atributos privados
    private double x;
    private double y;

    // Constructor sin parámetros
    public Punto() {
        x = 0.0;
        y = 0.0;
    }

    // Constructor con parámetros
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Obtener coordenada X
    public double getX() {
        return x;
    }

    // Obtener coordenada Y
    public double getY() {
        return y;
    }

    // Modificar coordenada X
    public void setX(double nuevoX) {
        x = nuevoX;
    }

    // Modificar coordenada Y
    public void setY(double nuevoY) {
        y = nuevoY;
    }

    // Mover el punto
    public void mover(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    // Calcular distancia desde el origen
    public double calcularDistanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Mostrar coordenadas
    public void mostrarCoordenadas() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
