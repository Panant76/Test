import java.util.Arrays;

public class main3 {
    public static void main(String[] args) {
        int[]arr={2,45,67,2,34,35,34,56,78,9,7,6,6,43};
        System.out.println(duplicates(arr));
    }
    public static int duplicates(int[] array) {
        //Make the magic happen
        if (array.length == 0 || array.length == 1) {
            return 0;
        }
        Arrays.sort(array);
        int j=0;
        for(int i=0;i< array.length-1;i++){
                if(array[i]==array[i+1]){
                    j++;
                    i++;
            }
        }
        return j;
    }
}