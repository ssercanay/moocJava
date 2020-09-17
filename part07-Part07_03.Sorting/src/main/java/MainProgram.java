
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                index = i;
            }
        }
        
        return index;
        
    // write your code here
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
            }
        }        
        for (int i = 0; i < table.length; i++) {
            if (table[i] == smallest) {
                index = i;
            }
        }
        return index;
        

    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here

        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;

    }
    
    public static void sort(int[] array){
        int n;
        for (int i = 0; i < array.length; i++) {
            n = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, n, i);
            System.out.println(array);
        }
        
    }

}
