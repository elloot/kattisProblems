/**
 * Class description
 * 2019-11-28
 * Author: Elliot Duchek
 */
import java.util.Scanner;
public class DiceCup {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);

            String yeet = kb.nextLine();

            String[] yeetarray = yeet.split(" ");

            int N = Integer.parseInt(yeetarray[0]);
            int M = Integer.parseInt(yeetarray[1]);

            int diff = Math.abs(N-M);

            if (N < M) {
                for (int i = N; i <= M; i++) {
                    System.out.println(i+1);
                }
            } else if (N > M) {
                for (int i = M; i <= N; i++) {
                    System.out.println(i+1);
                }
            } else if (N == M) {
                System.out.println(N+1);
            }
    }
}