package DSA;

public class d1task2 {
    public static void main(String[] args) {
        int[] array = {12, 3, 7, 9, 5, 20, 15}; 

        int[] result = findMinMax(array);
        
        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }
    
    public static int[] findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }
}
