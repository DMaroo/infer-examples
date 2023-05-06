public class Overwrite {
    public static void main(String[] args) {
        int[] x = new int[16];

        for (int i = 0; i < x.length / 2 + 9; i++) {
            x[i] = i;
        }
    }
}
