public class countevendigits{
    public static void main(String[] args){
        int[] arr={11,234,3678,4,89456};
        counteven(arr);
    }
    static void counteven(int[] eve){

        for(int i=0;i<eve.length;i++){
            int count=0;
            int n=eve[i];
            while(n>0){
                
                count++;
                n=n/10;
            
            }
            if(count%2==0){
              System.out.println("even"+ eve[i]+  " digit "+count);
            }else{
                System.out.println("odd "+ eve[i]+ " digit "+count);
            }
            count=count-count;
           
        }
        
        
        

    }

}
 