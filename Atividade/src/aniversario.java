import java.util.Scanner;

public class aniversario {

    public void aniver() {

            Scanner Leitor = new Scanner(System.in);

            Integer dia;
            Integer mes;
            Integer ano;

            System.out.print("Qual o dia, mes e ano de seu aniversario ? ");
            dia = Leitor.nextInt();
            mes = Leitor.nextInt();
            ano = Leitor.nextInt();

            if (dia < 1 || dia > 31) {
                System.out.print("Dia Invalido");
                return;
            }
            if (mes < 1 || mes > 12){
                System.out.println("Mes Invlalido");
                return;
            }

            if (ano != 2020) {
                System.out.println("Ano Invalido");
                return;
            } else {
                Menu.escrever("Data Valida ");
            }

        }
    }

