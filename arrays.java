import java.util.*;
public class arrays {
    public static void main(String[] args){
        int[] arr=new int[4];
        System.out.println(arr[1]);
        Scanner sc=new Scanner(System.in);
        String[] s1=new String[4];
        for(int i=0;i<s1.length;i++){
            s1[i]=sc.next();
        }
        System.out.print(Arrays.toString(s1) + s1[3]);
        
        



    }
    
}
