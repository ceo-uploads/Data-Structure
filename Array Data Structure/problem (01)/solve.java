class solve {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 13, 6, 11, 8, 1};
        int min = 0;
        int max = 0;
        int max_index = 0;
        int min_index = 0;

        for (int i = 0; i <= arr.length -1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            } else if (arr[i] < max) {
                min = arr[i];
                min_index = i;
            }
        }

        System.out.println("Maximum Value: " + max + " at index [" + max_index + "]");
        System.out.println("Minimum Value: " + min + " at index [" + min_index + "]");
        
    }
}