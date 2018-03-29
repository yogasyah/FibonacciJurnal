import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];

        fib[0] = 1;
        fib[1] = 1;

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Jumlah : ");
        long sum = 0;
        for (int i = 0; i < n; i++){
            sum = fib[i] + sum;
        }
        System.out.println(sum);
    }
}
