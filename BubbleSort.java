       // Time Complexity : O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int ar[] = {7,4,5,2,9,1,3,6,8};
        int size = ar.length;
        System.out.println("Array before sorting :");
        for(int n : ar)
        System.out.print(n + " ");
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size-1-i ; j++)
            {
                if(ar[j] > ar[j+1])
                {   // Swapping
                    // Logic 1
                    // ar[j] = ar[j] + ar[j+1];
                    // ar[j+1] = ar[j] - ar[j+1];
                    // ar[j] = ar[j] - ar[j+1];

                    //Logic 2
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
                System.out.println();
                for(int n : ar)
        System.out.print(n + " ");
            }
            
        }
        System.out.println();
        System.out.println("Array after sorting : ");
            for(int n : ar)
        System.out.print(n + " ");
    }
}
