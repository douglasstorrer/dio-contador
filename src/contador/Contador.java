package contador;

import java.util.Scanner;

import contador.exception.ParametrosInvalidosException;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro par�metro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo par�metro");
    int parametroDois = terminal.nextInt();
    
    try {
      //chamando o m�todo contendo a l�gica de contagem
      contar(parametroUm, parametroDois);
    
    }catch (ParametrosInvalidosException exception) {
      System.out.println("O segundo par�metro deve ser maior que o primeiro"); 
    }
    
  }
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if(parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }
    
    int contagem = parametroDois - parametroUm;
    for (int i = 0; i < contagem; i++) {
      System.out.println("Imprimindo o n�mero " + (i+1));
    }
  }
}
