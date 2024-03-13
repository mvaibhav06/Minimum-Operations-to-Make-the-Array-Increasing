public class ArrayIncreasing {
    public static int minOperations(int[] nums){
        int counter = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                counter += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return counter;
    }
    public static void main(String[] args) {

    }
}
