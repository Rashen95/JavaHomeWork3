//Реализовать алгоритм сортировки слиянием

public class Task01 {
    public static void main(String[] args) {
        int[] massive = new int[]{15, 1, 10, 2, 8, -5, 19, 7, 6, 15, 10, 0, 1, -1, -7};
        massive = sort(massive);
        for (int i : massive) {
            System.out.printf("%s   ", i);
        }
    }

    static int[] sort(int[] massive) {
        if (massive == null) {
            return null;
        } else if (massive.length < 2) {
            return massive;
        } else {
            int[] massive1 = new int[massive.length / 2];
            System.arraycopy(massive, 0, massive1, 0, massive.length / 2);
            int[] massive2 = new int[massive.length - massive.length / 2];
            System.arraycopy(massive, massive.length / 2, massive2, 0, massive.length - massive.length / 2);
            massive1 = sort(massive1);
            massive2 = sort(massive2);
            return merge(massive1, massive2);
        }
    }

    static int[] merge(int[] massive1, int[] massive2) {
        int[] massive3 = new int[massive1.length + massive2.length];
        int position1 = 0;
        int position2 = 0;
        for (int i = 0; i < massive3.length; i++) {
            if (position1 == massive1.length) {
                massive3[i] = massive2[position2];
                position2++;
            } else if (position2 == massive2.length) {
                massive3[i] = massive1[position1];
                position1++;
            } else if (massive1[position1] < massive2[position2]) {
                massive3[i] = massive1[position1];
                position1++;
            } else {
                massive3[i] = massive2[position2];
                position2++;
            }
        }
        return massive3;
    }
}