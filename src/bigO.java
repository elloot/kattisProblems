import java.util.Scanner;

/**
 * Class description
 * 2019-11-29
 * Author: Elliot Duchek
 */
public class bigO {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("plz tell how mny popl on ship: ");
        int persons = kb.nextInt();
        int island1 = 1;
        int island2 = 1;
        int islandN;
        int count = 1;

        while (persons > 0) {
            islandN = island1 + island2;
            island1 = island2;
            island2 = islandN;
            persons = persons - islandN;
            count++;
            if (persons < 0) {
                System.out.println("Number of islands it takes for there to be zero pompl on bot is equal to the positive integer: " + count);
            }
        }
    }

}
