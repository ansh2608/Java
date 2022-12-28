class Solution {
    public static int[][] generate(int numRows) {
        int[][] arr= new int[numRows][];
        for(int i=0;i<numRows;i++){
            arr[i] = new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<arr[i].length;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
}