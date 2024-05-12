import java.util.*;

public class gerador {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> caracteresEvitados = Arrays.asList(34, 39, 40, 44, 46, 41, 47, 58, 91, 92, 93, 94, 96);
        Scanner sc = new Scanner(System.in);
        int quant, numeroAleatorio;

        System.out.println("Quantos caracteres sua senha deve conter? ");
        quant = sc.nextInt();

        char[] vet = new char[quant];

        for (int i = 0; i < quant; i++) {
            do {
                // Gerar um número aleatório entre 33 e 122
                numeroAleatorio = rand.nextInt(90) + 33;
            } while (caracteresEvitados.contains(numeroAleatorio)); // Verifica se o número gerado está na lista de caracteres evitados

            char caractere = (char) numeroAleatorio;
            
            vet[i] = caractere;
        }

        System.out.print("Senha gerada: ");

        for (int i = 0; i < quant; i++) {
            System.out.print(vet[i]);
        }
        System.out.println();
    }
}