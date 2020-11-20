
 import java.util.Arrays;
    public class Sort{
        public static void bubbleSort(int[] array){
            boolean sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length-1-i; j++) {
                    if (array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                        sorted = false;
                    }
                }
                if (sorted){
                    break;
                }
            }
        }
        public static void main(String[] args) {
            int[] array = {1,2,3,10,5,6};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        }
    }

