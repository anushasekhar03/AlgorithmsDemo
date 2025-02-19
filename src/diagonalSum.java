public class diagonalSum {
    public static void main(String[] args) {
        int arr[][]= {
                {1, 2, 3},
                {4, 5, 6},
                {7,8,9}
        };
        int leftdiagonal=0;
        int rightdiagonal=0;
        int totalSum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    leftdiagonal+=arr[i][j];
                }
                else if(j==arr.length-1-i){
                    rightdiagonal+=arr[i][j];
                }
            }
        }
        System.out.println(leftdiagonal);
        System.out.println(rightdiagonal);
        totalSum=leftdiagonal+rightdiagonal;
        System.out.println(totalSum)
        ;
    }
}
