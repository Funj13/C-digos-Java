import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomes[] = new String[6];

        nomes[0] = "a vingança";
        nomes[1] = "com grandes poderes";
        nomes[2] = "nunca é plena";
        nomes[3] = "vem";
        nomes[4] = "mata a alma e envenena"; 
        nomes[5] = "grandes responsabilidades";

            for (int i = 0; i < nomes.length; i++) {
	            if(i%2==0){
	        	    System.out.println(nomes[i]);
	            }
            } 
            for (int i = 0; i < nomes.length; i++){
                if (i % 2 != 0) {
                        System.out.println(nomes[i]);
                }
            }
        }
    }

