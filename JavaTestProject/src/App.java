import testclass.*;
import java.util.ArrayList;
import Animal.*;


public class App {
    public static void main(String[] args) throws Exception {

        testclass sw = new testclass();
        Animal an = new Animal();

        an.iamdog();
        
        
        sw.printfunction();
        
        an.doStuff();
        
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(8);
        a.add(12);
        a.add(44);
        a.add(2);
        a.add(124);
        a.add(442);
        a.add(44);
        a.add(12);
        
        
        System.out.println(a);

        
        
        
    }
}


