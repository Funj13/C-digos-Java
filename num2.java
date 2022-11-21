
import java.util.Scanner;

public class num2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        String vetorNomes[] = new String[5];
        String nomes = "";

        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println("Digite suas cidades favoritas:\n");
            nomes = leia.nextLine();
            vetorNomes[i] = nomes;
        }

        System.out.println("As cidades digitadas foram:");

        for(int i = 0; i < vetorNomes.length; i++){
            System.out.printf(vetorNomes[i]);

        }
    }
} 
