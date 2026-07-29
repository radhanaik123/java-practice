
import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=60;
        int index=Linearsearch(arr,target);
        System.out.println("the elem is:"+index);
        boolean checking=search(arr,target);
        System.out.println("return true or false if elem is found:"+checking);
        String str="radha";
        char ch='a';
        char s1=charactersearch(str,ch);
        System.out.println(s1);


    }
    static int Linearsearch(int[] ar,int tar){
            if(ar.length==0){
                return -1;
            }
            for(int i=0;i<ar.length;i++){
                if(ar[i]==tar){
                    return i;
                }
            }
            return -1;
    
        
    
}
   static boolean search(int[] b1,int targ){
    if(b1.length==0){
        return false;
    }
    for(int i=0;i<b1.length;i++){
        if(b1[i]==targ){
            return true;
        }

    }
    return false;
   }
   static char charactersearch(String s2,char c2){
    if(s2.length()==0){
        return '\0';
    }
    for(int i=0;i<s2.length();i++){
        if(s2.charAt(i)==c2){
            return c2;
        }
    }
    return '\0';
   }
}
