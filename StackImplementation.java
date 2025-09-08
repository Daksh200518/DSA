public class StackImplementation {
    public static void main(String[] args) {
        DStack st = new DStack();
        st.pop();
        st.push(6);
        st.show();
        st.push(4);
        st.show();
        st.push(9);
        st.show();
        st.pop();
        st.show();
        st.push(8);
        st.show();
        st.push(2);
        st.show();
        st.push(1);
        st.show();
        st.push(5);
        st.show();
        System.out.println("Removed : " +st.pop());
        System.out.println("Removed : " +st.pop());
        System.out.println("Removed : " +st.pop());
        System.out.println("Removed : " +st.pop());
        System.out.println("Removed : " +st.pop());
        System.out.println("Removed : " +st.pop());
        st.show();
    }
}
// class Stack{
//     int n;
//     int ar[];
//     int top = 0;
//     Stack(int n){
//         this.n = n;
//      ar = new int[n];
//     }
        

//     public boolean isFull(){
//         return top==n;
//     }
//     public boolean isEmpty(){
//         return top==0;
//     }
//     public void push(int n){
//         if(isFull())
//         System.out.println("Stack Overflow");
//         else
//         {
//             ar[top] = n;
//             top++;
//         }
//     }
//     public int pop(){
//         int data=0;
//         if(isEmpty())
//         {
//             System.out.println("Stack Underflow");
//         }
//         else{
//             top--;
//          data = ar[top];
//         ar[top] = 0;
//         }
//         return data;
//     }
//     public void show(){
//         for(int i=0;i<top;i++)
//         {
//             System.out.print(ar[i] + " ");
//         }
//         System.out.println();
//     }
// }

class DStack{
    int capacity=2;
    int ar[] = new int[capacity];
    int top = 0;
    
    public boolean isFull(){
        return top==capacity;
    }
    public boolean isEmpty(){
        return top==0;
    }
    public void push(int n){
            if(isFull()){
                
                int dynar1[] = new int[capacity*2];
                for(int i = 0; i <capacity; i++){
                    dynar1[i] = ar[i];
                }
                capacity *= 2;
                ar = dynar1; 
            }
            ar[top] = n;
            top++;
    
    }
    public int pop(){
        int data=0;
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        else{
            top--;
         data = ar[top];
        ar[top] = 0;
         if(top<capacity/4){
            int dynar2[] = new int[capacity/2];
                for(int i = 0; i <=capacity/4; i++){
                    dynar2[i] = ar[i];
                }
                capacity /= 2;
                ar = dynar2; 
        }
    }
        return data;
    }
    public void show(){
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            if(str == ""){
                return str;
            }
            int len;
            len = str.length()<strs[i].length()?str.length():strs[i].length();
            for(int j=0;j<len;j++){
            if(strs[i].charAt(j) == str.charAt(j)){
                continue;
            }
            else{
                str = strs[i].substring(0,j);
            }
            }
        }
        return str;
    }
}

class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        String stresult = "";
        int len;
        len = strs[0].length()<strs[1].length()?strs[0].length():strs[1].length();
        for(int i=0;i<len;i++){
            if(strs[0].charAt(i) == strs[1].charAt(i)){
                stresult+= strs[0].charAt(i);
            }
        }
        if(stresult == "")
        return stresult;
        for(int i=2;i<strs.length;i++){
            for(int j=0;j<stresult.length();j++){
            if(strs[i].charAt(j) == stresult.charAt(j)){
                continue;
            }
            else{
                stresult = strs[i].substring(0,j);
            }
            }
        }
        return stresult;
    }
}