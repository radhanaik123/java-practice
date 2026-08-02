

public class CountZeros {
    public static void main(String[] args){
        CountZeros c1=new CountZeros();
        int[] arr={0,5,0,8,2,0};
        int zero=c1.CountingZeros(arr);
        System.out.print(zero);
    }
    int CountingZeros(int[] a1){
        int count=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]==0){
                count++;
            }
        }
        return count;
    }
    
}
