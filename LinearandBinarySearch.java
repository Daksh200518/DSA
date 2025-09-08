class LinearandBinarySearch{
    public static void main(String[] args) {
        int target = 7;
        int ar[] = {1,3,5,7,9};
        int linearresult = linearSearch(target, ar);
        if(linearresult == -1)   
        System.out.println("Target not found");
        else
        System.out.println(target + " found at index : "+ linearresult);
         int binaryresult =  binarySearch(ar, target);
         if(binaryresult != -1)
        System.out.println("Result found at index : " + binaryresult);
        else 
        System.out.println("Element not found");
        int binaryresult2 = binarySearch(ar,target,0,ar.length-1);
        if(binaryresult2 != -1)
        System.out.println("Result found at index : " + binaryresult);
        else 
        System.out.println("Element not found");
    }
    //         Time Complexity : O(n)
     public static int linearSearch(int target,int[] ar){
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == target)
            return i;
        }
        return -1;
     }
              // Time Complexity : O(log(n))
         public static int binarySearch(int []ar , int target)
         {
            int start = 0;
            int end = ar.length-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(target == ar[mid])
                return mid;
                else if(target<mid)
                end = mid-1;
                else 
                start = mid + 1;
            }
            return -1;
         }

     public static int binarySearch(int[] ar,int target,int first,int last){   
       if(first<=last){
        int mid = (first+last)/2;
        if(target == ar[mid])
        return mid;

        else if(target> ar[mid])
            return binarySearch(ar, target,mid+1,last);
        
        else 
        return binarySearch(ar, target, first, mid-1);
    }
    return -1;
     }
    }