import java.util.Arrays;

public class SortFunctionSwap {
    public static void main(String[] args) {
        long start  =System.currentTimeMillis();

        int[] intArray = {20000,30,40,1407,9,600,1050,400,8006};
        sort(intArray);

        long end  = System.currentTimeMillis();
        System.out.println((end-start) + " : milliseconds");
    }

    private static void sort(int[] intArray) {
        int temp = 0;
        for(int i = 0; i < intArray.length;i++){
            for(int j = i+1; j < intArray.length; j++){
                if(intArray[i] < intArray[j]){
                    temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
