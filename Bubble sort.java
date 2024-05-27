//This code is use for
public class Main {
    public static void main(String[] args) {
        int[] a = {3, 7, 9, 8, 2, 1, 5};
        int temp;
        int length = a.length;
        for (int j = 0; j < length-1; j++) {

            for (int i = 0; i < length - j - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.printf(a[k] + " ");

        }
    }
}
