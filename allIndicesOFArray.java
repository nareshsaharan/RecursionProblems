import java.util.*;
public class MyClass {
    
    static int[] findIndex(int arr[], int si, int x) {
        
        // base case
        if(si == arr.length) {
            return new int[0];
        }
        
        // recAns
        int smallAns[] = findIndex(arr, si + 1, x);
        
        if(arr[si] == x) {
            int temp[] = new int[smallAns.length + 1];
            temp[0] = si;
            
            for(int i = 0; i < smallAns.length; i++) {
                temp[i+1] = smallAns[i];
            }
            
            return temp;
        }else {
            return smallAns;
        }
        
        
    } 
    
    
    public static void main(String args[]) {
      int arr[] = {6, 2, 3, 3, 4, 4, 6, 3};
      
      int ans[] = findIndex(arr,  0, 6);
      
      System.out.println(Arrays.toString(ans));
    }
}
