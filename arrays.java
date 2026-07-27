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
        System.out.println(Arrays.toString(s1) + s1[3]);
        
      //Reverse an array elements  
      int[] a1={10,20,30,40,50};
      for(int i=0;i<a1.length/2;i++){
        int temp=a1[i];
        a1[i]=a1[a1.length-1-i];
        a1[a1.length-1-i]=temp;
      }
      for(int i=0;i<a1.length;i++){
        System.out.print(a1[i]+" ");
      }
      System.out.println(    );

     //maximum element in the array
     int[] a2={12,10,25,9,6};
     int max=a2[0];
     for(int i=0;i<a2.length;i++){
       
        if(max<a2[i]){
            max=a2[i];
        }
    
     }
     System.out.println(max);
     
     //minimum element in the array
      int min=a2[0];
     for(int i=0;i<a2.length;i++){
       
        if(min>a2[i]){
            min=a2[i];
        }
    
     }
     System.out.println(min);


    }
    
}
