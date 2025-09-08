              // Time Complexity : O(n^2)
public class SelectionSort { 
    public static void main(String[] args) {
        int ar[] = {7,4,5,2,9,1,3,6,8};
        int size = ar.length;
        System.out.println("Array before sorting :");
        for(int n : ar)
        System.out.print(n + " ");
        
        for(int i=0;i<size-1;i++){
            int index = i;
            for(int j=i+1;j<size;j++){
            if(ar[index]>ar[j]) {   
            index = j;
            }
            }
            int temp = ar[i];
            ar[i]= ar[index];
            ar[index]= temp;
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

