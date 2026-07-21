public class conditionalStatements{
    public static void main(String[] args){
        int x=8;
        int y=19;
        float m=2.375f;
        if(x>10 && x<y)
        System.out.println("hello");
        else if((float)y/x==m)
        System.out.println("it is divisible:"+m);
        else{
        System.out.println("Bye");
        System.out.println("thank you");
    
    }
      //Ternary operator
        String re=(x==y)?"equal":"not equal";
        System.out.println("result:"+re);
        //switch statement
        int day=4;
        switch (day){
            case 1:
                System.out.println("monaday");
                break;
            case 2:
                System.out.println("tuesday"); 
                break;
            case 3:
                System.out.println("wednesday"); 
                break; 
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday"); 
                break;
            default:
                    System.out.println("inavalid number");
        }
    }
}
