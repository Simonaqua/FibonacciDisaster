import java.util.Scanner;

public class Main {

   static void fib(int f[])
    {
        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 1;
        f[1] = 1;


        // Add the previous 2 numbers
        // in the series and store
        // last digit of result
        for (int i = 2; i <= 59; i++)
            f[i] = (f[i - 1] + f[i - 2]) % 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfTests = s.nextInt();
        int[] f = new int[60];
        for(int i = 0 ; i< numOfTests ; i++){
            fib(f);
            long sol = s.nextLong();
            System.out.println(f[(int) (sol % 60)]);
        }
    }
}
