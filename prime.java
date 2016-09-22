public class prime{
    public static void main(String args[]){
        System.out.print("2, ");
        int m = 1;
        for (int j = 1; j <= 1000; j++){
            for (int k = 2; k <= j-1; k++){
                if(j%k == 0){break;}
                if(k == j-1){
                    m++;
                    if(m % 10 == 0) System.out.println(j + ", ");
                    else System.out.print(j + ", ");
                }
            }
        }
    }
}