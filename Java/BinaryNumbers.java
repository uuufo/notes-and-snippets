import java.util.Random;

public class BinaryNumbers {
    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt();
        StringBuilder binary = new StringBuilder();
        int ones = 0;
        int max = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                binary.insert(0, 0);
                ones = 0;
            } else {
                binary.insert(0, 1);
                ones++;
                if (max < ones) {
                    max = ones;
                }
            }
            n /= 2;
        }
        System.out.println(binary);
        System.out.println(max);
    }
}
