class operators{
    public static void main(String a[]){
        
        int n=2;
        int n1=4;
        System.out.println("re:"+(n+n1)+"\n"+(n*n1)+"\n"+(n/n1)+"\n"+(n%n1));
        //n+=1;
       // n1+=3;
        //System.out.println("increment by 1 and 3:"+n+"\n"+n1);
         n++;   //post increment
         --n1;   //pre increment
         System.out.println(n+"\n"+n1);
         int res=n--;
         int rd=++n1;
         System.out.println("res and rd:"+res+"\n"+rd);
         double d1=6.8;
         double d2=9.6;
         boolean b=d1>d2;
         boolean b1=d1<d2;
         boolean n2=n==n1, n3=n!=n1;
         boolean m=d1>=d2,m1=d1<=d2;
         System.out.println(b+"\n"+b1+"\nn2:"+n2+"\nn3:"+n3+"\nm:"+m+"\nm1:"+m1);
         //boolean l1=n>=n1&n<=n1;
         //boolean l1=n>=n1|n<=n1;
         //boolean l2=d1==6.8&d2!=4;
         boolean l1=n>=n1&&n<=n1;
         boolean l2=d1==6.8||d2!=4;
         
         System.out.println("l1:"+l1+"\nl2:"+l2);



         

        
    }

}