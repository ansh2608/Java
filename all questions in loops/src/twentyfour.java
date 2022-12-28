public class twentyfour {
    public static void main(String[] args) {
        int h=4, w=6;
        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
