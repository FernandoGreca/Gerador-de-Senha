import java.util.*;

public class explicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        char converter;

        System.out.print("Digite um numero: ");
        numeroDigitado = sc.nextInt();

        System.out.println("Numero digitado: " + numeroDigitado);

        converter = (char) numeroDigitado;

        System.out.println("Numero na tebela ASCII: " + converter);

    }
}