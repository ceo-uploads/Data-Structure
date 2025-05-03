public class solve {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 13, 6, 11, 8, 1};

        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Input an array element to find its index: ");
        int userInput = input.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (userInput == arr[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The element " + userInput + " is at index = " + index);
        } else {
            System.out.println("The element " + userInput + " is missing in the array.");
        }

        input.close();
    }
}
