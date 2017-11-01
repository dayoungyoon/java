public class main {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<=12-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");//println 은 엔터가 된거에요~!
            }
            System.out.println("");
        }
    }
}
