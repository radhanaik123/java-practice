

public class p2 {
    public static void main(String[] args){
        
        for(int i=1;i<=50;i++){
         while(i%2==0){
                System.out.println("even:"+i);
                i++;
            }
        }
         /*while(i<=50){
            System.out.println(i);
            i+=2;
         }
         */
        for(int i=1;i<=50;i+=2){
            System.out.println("odd:"+i);
        } 
       for(int i=1;i<=50;i++){
        while(i%2==1){
            System.out.println(i);
            i++;
        }
       }

        
    }
    
}
