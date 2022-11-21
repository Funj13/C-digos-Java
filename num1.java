import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos sorvetes deseja digitar? \n");
        int n = leia.nextInt();

        String vetor[] = new String[n];
        String sabor = "";

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite os sabores de sorvete: \n");
            sabor = in.nextLine();

            vetor[i] = sabor;

        }
        for(int i = 0; i < vetor.length; i++){
        System.out.printf("Os sabores digitados foi:" + vetor[i] + "\n");
    }
}
}
