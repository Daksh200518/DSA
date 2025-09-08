      // Time Complexity : Best: O(nlog(n))   Worst : O(n^2)
public class QuickSort {
    public static void main(String[] args) {
        int ar[] = {5,7,3,9,1,8,2};
        quickSort(ar,0,ar.length-1);
        for(int n : ar)
        System.out.print(n + " ");
    }
    public static void quickSort(int[] ar,int low,int high){
        if(low<high){
        int pi = partition(ar,low,high);
        quickSort(ar, low, pi-1);
        quickSort(ar,pi+1,high);
        }
    }
    public static int partition(int[] ar,int low,int high){
        int pivot = ar[high];
        int i = low-1;
        for(int j = low ; j < high ; j++){
            if(ar[j]<pivot)
            {
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
            int temp = ar[i+1];
                ar[i+1] = ar[high];
                ar[high] = temp;
        return i+1;
    }
}
