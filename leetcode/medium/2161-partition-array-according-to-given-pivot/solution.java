class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        
        int[] temp = new int[n];
        int idx = 0;
        
        // 1st pass: elements < pivot
        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                temp[idx++] = nums[i];
            }
        }
        
        // 2nd pass: elements == pivot
        for(int i = 0; i < n; i++) {
            if(nums[i] == pivot) {
                temp[idx++] = nums[i];
            }
        }
        
        // 3rd pass: elements > pivot
        for(int i = 0; i < n; i++) {
            if(nums[i] > pivot) {
                temp[idx++] = nums[i];
            }
        }
        
        return temp;
    }
}