import java.util.Arrays;

public class removeElement {
    public static int rE(int[] nums, int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = '_';
            }
        }
        for (int i : nums){
            if(Character.isDigit((char)i + '0')){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int sol = rE(arr, 2);
        System.out.println(sol);
        String s = "hello";
    }
}
