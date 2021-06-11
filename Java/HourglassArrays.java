import java.util.*;

public class HourglassArrays {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(-1, -1, 0, -9, -2, -2);
        List<Integer> list2 = List.of(-2, -1, -6, -8, -2, -5);
        List<Integer> list3 = List.of(-1, -1, -1, -2, -3, -4);
        List<Integer> list4 = List.of(-1, -9, -2, -4, -4, -5);
        List<Integer> list5 = List.of( -7, -3, -3, -2, -9, -9);
        List<Integer> list6 = List.of(-1, -3, -1, -2, -4, -5);

        List<List<Integer>> arr = List.of(list1, list2, list3, list4, list5, list6);
        System.out.println(arr);

        int h = 0;
        int top = 0;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                    h += arr.get(y).get(x);
                    h += arr.get(y).get(x + 1);
                    h += arr.get(y).get(x + 2);

                    h += arr.get(y + 1).get(x + 1);

                    h += arr.get(y + 2).get(x);
                    h += arr.get(y + 2).get(x + 1);
                    h += arr.get(y + 2).get(x + 2);
                if (h > top || y == 0 && x == 0) {
                    top = h;
                }
                h = 0;
            }
        }
        System.out.println(top);
    }
}
