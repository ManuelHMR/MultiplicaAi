import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja a tabela de qual numero?");
        int num = scan.nextInt();
        System.out.println("Tabela de multiplicação de " + num + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scan.close();
    }
}

