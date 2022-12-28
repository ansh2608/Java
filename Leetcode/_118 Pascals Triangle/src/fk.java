public class fk {
    public static void reverse(int[] arr){
        for (int i=arr.length-1;i>=0;i--){

        }
    }
    public static void rot(int[] nums,int k){
        reverse(nums);
        for (int i=k-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
        for (int i= nums.length-1;i>=k;i--){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rot(arr,k);
    }
}
