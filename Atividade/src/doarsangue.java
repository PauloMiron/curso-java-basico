import java.util.Scanner;

public class doarsangue {

        public void doarsangue(){

            Integer idade;

            Scanner Leitor = new Scanner(System.in);

            System.out.println("Informe sua idade: ");
            idade = Leitor.nextInt();

            if (idade >= 18 && idade <= 67){
                System.out.println("Você pode doar sangue");
            } else {
                System.out.println("Você não pode doar sangue");
            }
        }
    }

