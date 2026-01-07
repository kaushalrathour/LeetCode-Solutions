class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int [] arr = nums;
        int removed = 0;
        for(int i = 0; i<len; i++) {
            if(nums[i] == val) {
                removed++;
            }else {
                nums[i-removed] = arr[i];
            }
        }
        return len - removed;
    }
}