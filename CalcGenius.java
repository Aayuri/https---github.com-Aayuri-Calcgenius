import java.util.Scanner;

public class CalcGenius {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        b = sc.nextInt();
        c = soma(a, b);
        System.out.println("a soma dos dois numeros é:" + c);
    }

    static int soma(int a, int b) {
        return a + b;
    }
}