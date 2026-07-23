public class methods{
    public static void main(String[] args){

    welcome();
    goodbye();
     methods cat=new methods();
    cat.sleep();
    methods s1=new methods();
    s1.student();
        
    }
    
    static void welcome(){
        System.out.println("welcome");
    }
      static void goodbye(){
        System.out.println("goodbye");

    }
    void eat(){
        System.out.println(" cat is eating");

    }
    void sleep(){
        eat();
        System.out.println("cat is sleeping");
    }
    static void college(){
        System.out.println("ABC college");
    }
    void student(){
        college();
        System.out.println("Rani");
    }
}
