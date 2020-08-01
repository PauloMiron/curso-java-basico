import java.util.Scanner;

public class Populacionall {

   public void pop(){

        Scanner leitor = new Scanner(System.in);
        Double populacaA;
        Double populacaB;
        Double taxa ;
        Double taxa2;
        Integer controle = 0;

        while (controle == 0){
        Menu.escrever("Informe a população do primeiro e segundo país: ");
        populacaA = leitor.nextDouble();
        populacaB = leitor.nextDouble();

        while (populacaA == 0 || populacaB == 0) {
            Menu.escrever("População não pode ser 0.");
            Menu.escrever("Informe a população do primeiro e segundo país: ");
            populacaA = leitor.nextDouble();
            populacaB = leitor.nextDouble();
        }

        Menu.escrever("Informe a taxa de crescemento dos paises : ");
        taxa = leitor.nextDouble();
        taxa2 = leitor.nextDouble();

        taxa = taxa / 100;
        taxa2 = taxa2 / 100;

        Double totalB;
        Double totalA;
        Integer ano = 0;


        if (taxa.equals(taxa2) && (populacaA.equals(populacaB))) {
            Menu.escrever("Os dados são iguais.");
        } else if (populacaA > populacaB && taxa > taxa2){
            Menu.escrever("A popoulacao A sempre vai ser maior que a populacao B");
        } else if (populacaB > populacaA && taxa2 > taxa) {
            Menu.escrever("A popoulacao B sempre vai ser maior que a populacao A");
        }else if (populacaA.equals(populacaB) && taxa > taxa2 || populacaB.equals(populacaA) && taxa2 > taxa  ) {
            Menu.escrever("Vai levar um ano para que uma cresca mais que a outra");
        }
        else if (populacaA < populacaB) {

            while (populacaA <= populacaB) {
                ano = ano + 1;
                totalA = (populacaA * taxa);
                populacaA = totalA + populacaA;
                totalB = (populacaB * taxa2);
                populacaB = totalB + populacaB;
            }
            System.out.print("Vai levar: " + ano + " Ano(s) Para a menor populacao ultrapassar ou igualar a Maior");
            System.out.println();
          }else {

            while (populacaB <= populacaA) {
                ano = ano + 1;
                totalA = (populacaA * taxa);
                populacaA = totalA + populacaA;
                totalB = (populacaB * taxa2);
                populacaB = totalB + populacaB;
            }
            System.out.print("Vai levar: " + ano + " Ano(s) Para a menor populacao ultrapassar ou igualar a Maior");
            System.out.println();
        }



        Menu.escrever("Digite 0 para continuar ou 1 para sair");
        controle = leitor.nextInt();

    }
}
}

