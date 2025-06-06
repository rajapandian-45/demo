package DSA;

import java.util.Arrays;

public class d1task1 {
    private int[] array;
    private int size;

    public d1task1(int capacity) {
        array = new int[capacity];
        size = 0;
    } 
    public void insert(int element) {
        if (size == array.length) {
         
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = element;
        size++;
        System.out.println("Inserted " + element + " into the array.");
    }
    public void delete(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element " + element + " not found in the array.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }        
        size--;
        System.out.println("Deleted " + element + " from the array.");
    } 
    public void update(int oldElement, int newElement) {
        int index = -1;      
        for (int i = 0; i < size; i++) {
            if (array[i] == oldElement) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element " + oldElement + " not found in the array.");
            return;
        }
        array[index] = newElement;
        System.out.println("Updated element " + oldElement + " to " + newElement);
    }
    public void display() {
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        d1task1 arr = new d1task1(5);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.display();
        arr.update(30,35);
        arr.display(); 
        arr.delete(20); 
        arr.display(); 
    }
}
