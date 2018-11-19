package homeWorks;

public class Arrays_operations {
    public static void main(String[] args) {

        // Initial massive
        int[] arr = new int[]{8, -2, 22, 4, 28};
        int[] arr1 = new int[]{5, 6, 12, 8, 21};
        int[] arr2 = new int[]{8, 9, 10, 7, 21};


        // Fill massive randomly
//            int index1 = 0;
//            while (index1 < arr.length)
//            {
//                arr[index1] = ((int)(Math.random() * 10) -5);
//                index1++;
//            }

        //Display in normal order
            int index2 = 0;
            while (index2 < arr.length)
            {
                System.out.println(arr[index2]);
                index2++;
            }

        // Display upside-down
        int index3 = arr.length - 1;
        while (index3 >= 0) {
            System.out.println(arr[index3]);
            index3--;
        }
        //Sum
        int index4 = 0;
        int sum = 0;
        while (index4 < arr.length) {
            sum += arr[index4];
            index4++;
        }
        System.out.println("Сумма элементов массива:\t" + sum);

        //Max element
        int index5 = 0;
        int max = arr[0];
        while (index5 < arr.length) {
            if (max < arr[index5]) {
                max = arr[index5];
            }
            index5++;
        }
        System.out.println("Max element in current array is:\t" + max);

        //Min element and it's index
        int index6 = 0;
        int min = arr[0];
        int minIdx = 0;
        while (index6 < arr.length) {
            if (min > arr[index6]) {
                min = arr[index6];
                minIdx = index6;
            }
            index6++;
        }
        System.out.println("Min element in current array is:\t" + min + "\n" + "Index of min element is:\t" + minIdx);
        //Amount & sum
        int index7 = 0;
        int sum1 = 0;
        int number = 0;
        while (index7 < arr.length) {
            if (arr[index7] % 2 == 0) {
                sum1 += arr[index7];
                number++;

            }
            index7++;
        }
        System.out.println("Number of odd elements is:\t" + number + "\n" + "Sum of odd elements is:\t" + sum1);
        //Amount & sum in range [20,30]
        int index8 = 0;
        int sum2 = 0;
        int number1 = 0;
        while (index8 < arr.length) {
            if (arr[index8] >= 20 && arr[index8] <= 30) {
                sum2 += arr[index8];
                number1++;
            }
            index8++;
        }
        System.out.println("Number of odd elements in range [20,30] is:\t" + number1 + "\n" + "Sum of odd elements is:\t" + sum2);

        //Max from even & Min from odd
        int index9 = 0;
        int i = 0;
        int j = 0;
        int max1 = arr[0];
        int min1 = arr[0];
        while (index9 < arr.length) {
            if (arr[index9] % 2 == 0) {
                if (max1 < arr[index9]) {
                    max1 = arr[index9];
                    i++;
                }
            } else {
                if (min1 > arr[index9]) {
                    min1 = arr[index9];
                    j++;
                }
            }
            index9++;
        }
        if (i > 0) {
            System.out.println("Max from even is:\t " + max1);
        }
        if (j > 0) {
            System.out.println("Min from odd elements is:\t " + min1);
        }

        //Change the sign
            int index10 = 0;
            while (index10 < arr.length)
            {
                if (arr[index10] < 0)
                {
                    arr[index10] *= (-1);
                }
             index10++;
            }
            // Check of current array
//            int index11 = 0;
//            while (index11 < arr.length)
//            {
//                System.out.print(arr[index11]);
//                index11++;
//            }

        // increment positive & decrement negative
        int index12 = 0;
        while (index12 < arr.length) {
            if (arr[index12] < 0) {
                --arr[index12];
            } else if (arr[index12] >= 0) {
                ++arr[index12];
            }
            index12++;
        }
        // Check of current array
//        int index13 = 0;
//        while (index13 < arr.length) {
//            System.out.println(arr[index13]);
//            index13++;
//        }

        // Average and amount of elements bigger than average
        int index14 = 0;
        double average = 0;
        while (index14 < arr.length) {
            average += arr[index14];
            index14++;
        }
        average /= arr.length;

        int index15 = 0;
        int counter = 0;
        while (index15 < arr.length) {
            if (arr[index15] > average) {
                counter++;
            }
            index15++;
        }
        System.out.println("Average of elements is " + average + "\nQuantity of elements bigger then average is " + counter);

        // Sum of arrays
        int[] arr3 = new int[arr.length];
        int index16 = 0;
        while (index16 < arr.length) {
            arr3[index16] = arr[index16] + arr1[index16];
            index16++;
        }
        System.out.println("Array of the sum is:\t " + arr3);

        // Concat

        int index17 = 0;
        int[] arr4 = new int[arr.length + arr1.length];
        while (index17 < arr3.length) {
            if (index17 < arr.length) {
                arr4[index17] = arr[index17];
            } else {
                arr4[index17] = arr2[index17 - arr.length];
            }
            index17++;
        }
        System.out.println("Concat array is:\t" + arr4);

        // Min & max change
        int[] arr5 = new int[arr.length];
        int index18 = 0;
        int min2 = arr[0];
        int max2 = arr[0];
        while (index18 < arr.length) {
            if (max2 < arr[index18]) {
                max2 = arr[index18];
            }
            if (min2 < arr[index18]) {
                min2 = arr[index18];
            }
            if (arr[index18] == min2) {
                arr5[index18] = max2;
            } else if (arr[index18] == max2) {
                arr5[index18] = min2;
            } else {
                arr5[index18] = arr[index18];
            }
            index18++;
        }
        System.out.println("Array with changed max & min is:\t" + arr5);

        // Delete
        int[] arr6 = new int[arr.length];
        int index19 = 0;
        int counter1 = 0;
        int min3 = arr[0];
        int max3 = arr[0];
        while (index18 < arr.length) {
            if (max3 < arr[index19]) {
                max3 = arr[index19];
            }
            if (min3 < arr[index19]) {
                min3 = arr[index19];
            }
            if (((arr[index19] != min)) && ((arr[index19] != max))) {
                arr6[index19 - counter1] = arr[index19];
            } else {
                counter1++;
            }
            index19++;
        }
        System.out.println("Array with deleted max and min is:\t" + arr6);
    }
}


