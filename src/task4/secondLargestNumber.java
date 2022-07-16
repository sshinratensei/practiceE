package task4;

public class secondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {9, 6, 17, 55, 52, 52, 18, 36, 6, 1,9};
        int largest = arr[0];
        int secondLargest = arr[0];

        boolean found=false;
        boolean lean =true;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");

        while(lean)
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    found=true;
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if (arr[i] > secondLargest) {
                    found=true;
                    secondLargest = arr[i];
                }
            }
            if(found) {
                System.out.println("Second largest number is: " + secondLargest);
                lean =false;
            } else {
                largest = arr[1];
                secondLargest = arr[1];
            }
        }
    }
}
