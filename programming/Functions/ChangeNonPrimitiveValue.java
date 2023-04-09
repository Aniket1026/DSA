package programming.Functions;

import java.util.Arrays;

public class ChangeNonPrimitiveValue {
    public static void main(String[] args) {
        int []arr={2,34,26,45,278};
        change(arr);                                // here the changes done by nums is refelected in arr
        System.out.println(Arrays.toString(arr));   // bcz non primitive point to same object . Hence changes
    }                                               // done by one are reflected to other
    static void change(int []nums){
        nums[2] = 33;
    }
}
