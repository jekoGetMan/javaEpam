package homeWorks;

public class Arrays_operations {

    public static void main(String[] args) {
        int[] arr = new int[] {2 ,0, 3, 2, 1};
        int min = arr[0];
        int i = 0;
        int j = 0;

        while (i < arr.length)
        {
            if (arr[i] > min)
                min = arr[i];
         i++;
        }

        System.out.println(min);
        /*
        while (j < arr.length)
        {
            System.out.println(arr[j]);
            j++;
        }
        */
    }




}
