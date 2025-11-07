public class Demo1{
    static int a;
    int b;
    public static void main(String[] args){
        Demo1 obj = new Demo1();
        System.out.println(obj.b);
        obj.b=40;
        System.out.println(obj.a);
        System.out.println(obj.b);
        Demo1 obj2= new Demo1();
        System.out.println(obj2.b); 
        a=40;
        obj2.b = 10+40;
        System.out.println(obj2.b); 
        System.out.println(obj.a);
        System.out.println(obj2.a);
    }
}