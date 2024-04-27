import java.util.Arrays;

public class MainProgram {
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0], index = 0;
        
        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex], index = startIndex;
        
        for(int i = startIndex; i <= table.length - 1; i++){
            if(table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
}
