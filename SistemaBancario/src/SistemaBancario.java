import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
         double valor =0;
      
         while (true) { 
         System.out.println("[1] Depositar");
         System.out.println("[2] Sacar");
         System.out.println("[3] Extrato");
         System.out.println("[4] Encerrar");
         
         if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
         
            switch(opcao){
              case 1:
               System.out.print("Coloque o valor a ser depositado: " + valor);
                 valor = scanner.nextDouble();
                  if(valor > 0){
                 saldo += valor;
                      System.out.println("Depósito realizado com sucesso!");
                }
               else {
                   System.out.println("Valor inválido para depósito!");
               }
                  break;
               
                
                case 2:
                    System.out.print("Coloque o valor a ser sacado: " +valor);
                    valor = scanner.nextDouble();
                if(valor > 0 && valor <=saldo){
                    saldo -= valor;
                    System.out.println("Saque concluído com sucesso!");
                }
                else {
                    System.out.println("Saque não concluído!");
                }
                    
                break;
                
                 case 3:
                     System.out.println("Seu saldo atual é: " +saldo);
                     break;
                
                 case 4:
                     System.out.println("Programa encerrado com sucesso!");
                
              
                default:
                    System.out.println("Opção inválida. Tente novamente!"); 
            }
            
         }
         }
    }
}
