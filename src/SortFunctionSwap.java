import java.util.Arrays;

public class SortFunctionSwap {
    public static void main(String[] args) {
        long start  =System.nanoTime();

        int[] intArray = {20000,30,40,1407,9,600,1050,400,8006};
        sort(intArray);

        long end  = System.nanoTime();
        long timeElaspsed = end - start;
        System.out.println(timeElaspsed/1000 + " : microseconds");
    }

    private static void sort(int[] intArray) {
        int temp = 0;
        //O[9^2]
        for(int i = 0; i < intArray.length;i++){
            for(int j = i+1; j < intArray.length; j++){
                if(intArray[i] < intArray[j]){
                    temp = intArray[j]; //O(1)
                    intArray[j] = intArray[i]; //O(1)
                    intArray[i] = temp; //O(1)
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
