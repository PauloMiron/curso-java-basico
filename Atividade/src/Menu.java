import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.swing.*;
import java.lang.annotation.Target;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Integer opcaoSelecionada = 0;
        Boolean devoApresentarMenu = true;
        imc imc = new imc();

            while (devoApresentarMenu) {

                System.out.println("Menu de opções: ");
                escrever(" _________________________________");
                escrever("| (1) - Comparar Menor e Maior    |");
                escrever("| (2) - Comparar 3 Numeros        |");
                escrever("| (3) - Idade para Doar Sangue    |");
                escrever("| (4) - Validar Data Aniversario  |");
                escrever("| (5) - Calculo do IMC            |");
                escrever("| (0) - Sair                      |");
                escrever("|_________________________________|");
                pular();
                System.out.print("Selecione sua opção:");
                pular();


                opcaoSelecionada = Leitor.nextInt();

                if (opcaoSelecionada != 0 && opcaoSelecionada != 1 && opcaoSelecionada != 2 && opcaoSelecionada != 3 && opcaoSelecionada != 4 && opcaoSelecionada != 5) {
                    System.out.println("Opção Inválida....");
                    pular();
                    devoApresentarMenu = true;
                } else {
                    devoApresentarMenu = false;
                }

                if (opcaoSelecionada == 1){
                    MenorMaior mem = new MenorMaior();
                    mem.menorMaior();
                } else if (opcaoSelecionada == 2){
                    Comparartres comparartres = new Comparartres();
                    comparartres.comparar3();

                } else if (opcaoSelecionada == 3){
                    doarsangue doar = new doarsangue();
                    doar.doarsangue();
                } else if (opcaoSelecionada == 4){
                    aniversario aniver = new aniversario();
                    aniver.aniver();
                } else if (opcaoSelecionada == 5){
                    imc.IMC();
                } else {
                    return;
                }


            }

        }














    public static void escrever(Object o)
    {
        System.out.println(o);
    }
    public static void pular()
    {
        System.out.print("\n");
    }
}


