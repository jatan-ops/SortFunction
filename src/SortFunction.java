import java.util.Arrays;

public class SortFunction {
    public static void main(String[] args) {
        long start  =System.currentTimeMillis();

        Integer[] intArray = {20000,30,40,1407,9,600,1050,400,8006};
        sort(intArray);

        long end  = System.currentTimeMillis();
        System.out.println((end-start) + " : milliseconds");
    }

    private static void sort(Integer[] intArray) {

        int[] newArray = new int[intArray.length];

        for (int i = 0; i<newArray.length; i++)
            newArray[i] = largestNumber(intArray);

        System.out.println("New Array :  "+Arrays.toString(newArray));

    }

    private static Integer largestNumber(Integer[] intArray) {

        int largestNumber = intArray[0];

        //O(N)
        for (Integer integer : intArray) {
            if (integer > largestNumber)
                largestNumber = integer;
        }

        int index = Arrays.asList(intArray).indexOf(largestNumber);
        intArray[index] = 0;

        return largestNumber;
    }
}
