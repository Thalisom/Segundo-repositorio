import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
System.out.println("Digite um número:");
int numero = teclado.nextInt();
teclado.close();

System.out.print("O número informado foi:" + numero);


}
}