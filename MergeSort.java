//    MY OWN CODE

// public class MergeSort {
//     public static void main(String[] args) {
//         int ar[] = {7,4,5,2,9,1,3,6,8};
//         mergeSort(ar,0,ar.length-1);
//         for (int i : ar) {
//             System.out.print(i+" ");
//         }
//     }
//     public static void mergeSort(int[] ar, int left,int right){
//         if(left<right){
//             int mid = (left+right)/2;
//             mergeSort(ar, left, mid);
//             mergeSort(ar, mid+1, right);
//              merge(ar,left,mid,right);
//         }
//     }
//     public static void merge(int []ar,int left,int mid,int right){
//         int[] a = new int[ar.length];
//         int l=left,r=mid+1,k=left;
//         while(l<=mid && r<=right){
//             if(ar[l]<ar[r]){
//                 a[k] = ar[l];
//                 l++;
//             }
//             else{
//                 a[k] = ar[r];
//                 r++;
//             }
//             k++;
//         }
//         while(l<=mid){
//             a[k] = ar[l];
//             l++;
//             k++;
//         }
//         while(r<=right){
//             a[k]=ar[r];
//             r++;
//             k++;
//         }
//         for(int i=left;i<=right;i++){
//             ar[i] = a[i];
//         }
//     }
// }

public class MergeSort {
    public static void main(String[] args) {
        int ar[] = {7, 4, 5, 2, 9, 1, 3, 6, 8};
        mergeSort(ar, 0, ar.length - 1);
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] ar, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(ar, left, mid);
            mergeSort(ar, mid + 1, right);
            merge(ar, left, mid, right);
        }
    }

    public static void merge(int[] ar, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = ar[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = ar[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                ar[k] = L[i];
                i++;
            } else {
                ar[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            ar[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            ar[k] = R[j];
            j++;
            k++;
        }
    }
}