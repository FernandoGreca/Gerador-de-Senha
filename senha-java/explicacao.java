import java.util.*;

public class explicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        char converter;

        // usuario digita um numero qualquer
        System.out.print("Digite um numero: ");
        numeroDigitado = sc.nextInt();

        // programa imprime este numero digitado
        System.out.println("Numero digitado: " + numeroDigitado);

        // ao colocar um numero em uma variavel do tipo caractere realizando o casting ele e automaticamente convertido para um caractere na tabela ASCII
        converter = (char) numeroDigitado;

        // numero depois de convertido e imprimido da tela
        System.out.println("Numero na tebela ASCII: " + converter);

    }
}