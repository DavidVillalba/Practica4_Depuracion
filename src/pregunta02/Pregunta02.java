package pregunta02;

public class Pregunta02 {

    static int maximo(int a, int b) { // suponemos que los tres números serán distintos
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.print("Introduzca un numero: ");
        a = Entrada.entero();
        System.out.print("Introduzca otro número: ");
        b = Entrada.entero();
        max = maximo(a, b);
        System.out.println("El número mayor es: " + max);
    }
}
