

public class countpositiveandnegative {
    public static void main(String[] args){
        int[] arr={-2,5,-8,9,10,-15};
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }else{
                negative++;            
            }
        }
           System.out.println("positive:"+positive);
            System.out.println("negative:"+negative);
    }
   
    
}
