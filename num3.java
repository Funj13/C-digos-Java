import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String Vetornomes[] = new String[7];
        String nomes = "";
        String nomePesquisado = "";

        for (int i=0; i < Vetornomes.length; i++){
           System.out.println("Digite os nomes:\n"); 
           nomes = leia.nextLine();
           Vetornomes[i] = nomes;
        }
        
        System.out.println("Insira o nome que deseja procurar!");
        nomePesquisado = leia.nextLine();

        for(int i = 0; i < Vetornomes.length; i++){
            if(Vetornomes[i].equals(nomePesquisado)){
                System.out.println("o nome é: " + nomePesquisado + " e sua posição é: " + (i + 1));
            }else if ((i + 1) == 7){
                System.out.println("Seu nome não foi encontrado");
            }

        }

    }
}
