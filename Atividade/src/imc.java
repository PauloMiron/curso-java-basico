import java.util.Scanner;

public class imc {

    public void IMC(){

        Menu menu = new Menu();
        Double peso;
        Double altura;
        Double resultado;

        Scanner leitor = new Scanner(System.in);

        Menu.escrever("Informe sua altura: ");
        altura = leitor.nextDouble();
        Menu.pular();
        Menu.escrever("Qual seu peso:");
        peso = leitor.nextDouble();
        Menu.pular();

        resultado = peso / (altura * altura);

        if (resultado <= 18.5){
            Menu.escrever("MAGREZA");
        } else if (resultado > 18.5 && resultado <= 24.9) {
            Menu.escrever("NORMAL");
        } else if (resultado > 24.9 && resultado <= 29.9){
            Menu.escrever("OBESIDADE GRAU 1");
        } else if (resultado > 29.9 && resultado <= 39.9){
            Menu.escrever("OBESIDADE GRAU 2");
        } else {
            Menu.escrever("OBESIDADE GRAVE");
        }


    }
}
