import java.util.Scanner;

/**
 * Class description
 * 2019-11-29
 * Author: Elliot Duchek
 */
public class tebryggningOlymp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numBag = getNumBag(kb);
        int numPpl = getNumPpl(kb);
        int[] bagReach = getBagReach(kb, numBag);
    }

    private static int[] getBagReach(Scanner kb, int numBag) {
        int[] bagReach = new int[numBag];

        for (int i = 0; i<numBag; i++) {
            System.out.print("How many cups of tea does bag #" + (i+1) + " make?");
            bagReach[i] = kb.nextInt();
        }
        return bagReach;
    }

    private static int getNumPpl(Scanner kb) {
        System.out.print("Input number of ppl: ");
        int numPpl = kb.nextInt();
        kb.nextLine();
        return numPpl;
    }

    private static int getNumBag(Scanner kb) {
        System.out.print("Input number of bagos: ");
        int numBag = kb.nextInt();
        kb.nextLine();
        return numBag;
    }
}
