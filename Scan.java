package Projeto;
import java.util.Scanner;
import java.util.ArrayList;// Import the Scanner class
class Scan extends Eletronico{
  public static void main(String[] args) {
    int Escolha;
    String Nome;
    String Modelo;
    double Potencia;
    double Tempo;
    int NumAparelhos;
    int n = 1;
    Scanner n0 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Numero de Aparelhos");
    NumAparelhos = n0.nextInt();  // Read user input
    for(int i=0; i < NumAparelhos; i++)
      {
        Scanner aparelhos = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual tipo de Aparelho Eletronico?");
        System.out.println("1: Eletroportaveis // 2: ELetrodomestico");
        Escolha = aparelhos.nextInt();  // Read user input
        if (Escolha == 1) {
        	Eletroportaveis Novo = new Eletroportaveis();
        }
        if (Escolha == 2) {
        	Scanner n1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Nome: ");
            Nome = n1.nextLine();  // Read user input
        	Scanner n2 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Modelo: ");
            Modelo = n2.nextLine();  // Read user input
        	Scanner n3 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Potência: ");
            Potencia = n3.nextDouble();  // Read user input
        	Scanner n4 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Tempo Ligado Funcionando: ");
            Tempo = n4.nextDouble();  // Read user input
        	Eletrodomestico Novo1 = new Eletrodomestico(Nome, Modelo, Potencia, Tempo);
        }
      }

  	}
}
