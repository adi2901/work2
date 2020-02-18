public class DeprecationMain { 
    @Deprecated
    public void Display()  { 
        System.out.println("Deprecatedtest display()"); 
    } 
  
    public static void main(String args[]) 
    { 
        DeprecationMain d1 = new DeprecationMain(); 
        d1.Display(); 
    } 
} 