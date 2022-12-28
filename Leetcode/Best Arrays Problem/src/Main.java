class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]==target && nums[j]==target){
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return ans;
    }
}