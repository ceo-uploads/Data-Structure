public class solve {
    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 9, 13, 6, 11, 8, 1};
        int even_count = 0;
        int odd_count = 0;
        java.util.ArrayList<Integer> evenList = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> oddList = new java.util.ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even_count++;
                evenList.add(num);
            } else {
                odd_count++;
                oddList.add(num);
            }
        }

        System.out.println("Total Even Number: " + even_count);
        System.out.println("Even Numbers: " + evenList);
        System.out.println("Total Odd Number: " + odd_count);
        System.out.println("Odd Numbers: " + oddList);
    }
}