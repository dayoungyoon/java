public class main {
    public static void main(String[] args) {
    /*1*/
        char ch1;
        ch1 = 'a';
        if (ch1 == ' ' || ch1 == ' ') {
            System.out.println("O");
        }
        else{
            System.out.println("1");
        }
    /*2*/
        String str;
        str = "halo";
        if (str == "hello") {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    /*3*/
        int rd1 = (int) (Math.random()*6)+1 ;
        int rd2 = (int) (Math.random() *6)+1;
        if (rd1 == rd2) {
            System.out.println("double");
            System.out.println(rd1+","+rd2);
        }
        else{
            System.out.println("not double");
            System.out.println(rd1+","+rd2);
        }
    /*5*/
        int score;
        score=75;
        if(score>=80) {
            System.out.println("A");

        }
        else if(score>=60){
            System.out.println("B");
        }
        else if(40<=score&&score<60){
            System.out.println("C");
        }
        else if (score<40){
            System.out.println("F");
        }
    /*6*/
        char ch2;
        ch2='d';
        if(ch2=='a'){
            System.out.println("A");
        }
        else if(ch2=='b'){
            System.out.println("B");
        }
        else if(ch2=='c'){
            System.out.println("C");
        }
        else{
            System.out.println("abcXXX");
        }
    /*7*/
        for (int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    /*8*/
        String value="12o34";
        char ch=' ';
        boolean isNumber=true;
        for(int i=0;i<value.length();i++){
            ch=value.charAt(i);
            if ('0'<=ch&&ch<='9'){
                isNumber=true;
            }
            else{
                isNumber=false;
            }
            if(!isNumber) break;
        }
        if(isNumber){
            System.out.println(value+"is number");
        }
        else{
            System.out.println(value+"is not number");
        }
    /*9*/
        int rd3 = (int) (Math.random()*6)+1 ;
        int rd4 = (int) (Math.random()*6)+1;
        while (rd3!=rd4){
            System.out.println("not matching");
            rd3 = (int) (Math.random()*6)+1 ;
            rd4 = (int) (Math.random() *6)+1;
        }
        System.out.println(rd3+","+rd4+"is matching");
    /*10*/
        for (int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==4) break;
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    /*11*/
        int num=12345;
        int sum=0;

        while (num>0){
            sum+=num%10;
            num/=10;

        }
        System.out.println("sum:"+sum);



    }
}