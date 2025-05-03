public class solve {
    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 9, 13, 6, 11, 8, 1};
        int sum = 0;
        int count = arr.length;

        for (int i : arr) {
            sum = sum + i;
        }

        int avg = sum / count;

        System.out.println("Sum = " + sum);
        System.out.println("Elements = " + count);
        System.out.println("Average = " + avg);
    }
}
