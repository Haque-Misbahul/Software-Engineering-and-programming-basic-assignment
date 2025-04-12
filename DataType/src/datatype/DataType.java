
package datatype;


public class DataType {

   
    public static void main(String[] args) {
         
       //int num = 10; it is calles dynamic initializarion
       boolean b;
       char c;
       short s = 32678;
       int i = 4;
       float f =10.3f;
       double d = 23982.934;
        
        b = true;
        
       System.out.println("b = "+b);
       
       c = 'a';
       System.out.println("c = "+c);
       
       System.out.println("s = "+s);
       System.out.println("f = "+f);
       System.out.println("d = "+d);
       
       
       //format specifier
       System.out.printf("boolean b = %b\n",b);
       System.out.printf("character = %c\n",c);
       System.out.printf("short = %d\n",s);
       System.out.printf("intiger = %d\n",i);
       System.out.printf("float = %.2f\n",f);
       System.out.printf("double = %.8f\n",d);
       
       
        
    }
    
}
