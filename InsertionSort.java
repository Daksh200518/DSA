             // Time Complexity : O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int ar[] = {7,4,5,2,9,1,3,6,8};
        int size = ar.length;
        System.out.println("Array before sorting :");
        for(int n : ar)
        System.out.print(n + " ");
        
        for(int i=1;i<size;i++)
        {
            int key = ar[i];
            int j = i-1;
            while(j>=0 && ar[j]>key)
            {
               ar[j+1] =  ar[j];
               j--;
            }
            ar[j+1] = key;
            System.out.println();
             for(int n : ar)
        System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("Array after sorting : ");
            for(int n : ar)
        System.out.print(n + " ");
    }
}
