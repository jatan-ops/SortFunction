import java.util.Arrays;

public class SortFunction {
    public static void main(String[] args) {
        int[] intArray = {20,30,40,147,9,6,1050,400,6};
        sort(intArray);
    }

    private static void sort(int[] intArray) {
        int i=0;
        int[] newArray = new int[intArray.length];

        newArray[i] = largestNumber(intArray);
        System.out.println(Arrays.toString(newArray));
        //for (int i = 0; i<newArray.length; i++)
       /* int j = largestNumber(intArray);
        intArray[j] = 0;*/

    }

    private static int largestNumber(int[] intArray) {

        int largestNumber = intArray[0];
        int i;

        for (i = 0; i < intArray.length; i++) {

            if (intArray[i] > largestNumber)
                largestNumber=intArray[i];

        }
        System.out.println("largestNumber: "+largestNumber+"  "+"i: "+i);
        System.out.println(Arrays.toString(intArray));
        return largestNumber;
    }
}
