import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClaseCadena cadena = new ClaseCadena();
        System.out.println("Introduzca su nombre completo:");
        String nombre = sc.nextLine();
        System.out.println("Sus iniciales son: " + cadena.DevuelveIniciales(nombre));

    }
}
