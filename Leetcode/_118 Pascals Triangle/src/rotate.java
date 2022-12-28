public class rotate {
    public static void rot(int[] nums,int k){
        for (int i=nums.length-k;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        for (int i=0;i<nums.length-k;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rot(arr,k);
    }
}
