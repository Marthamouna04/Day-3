public class DefaultValuesofNonStaticVariables{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    Boolean status;
    String str;
    public static void main(String[] args){
        DefaultValuesofNonStaticVariables obj = new DefaultValuesofNonStaticVariables();
        System.out.println("int: "+obj.i);  
        System.out.println("byte: "+obj.b); 
        System.out.println("short: "+obj.s); 
        System.out.println("long: "+obj.l); 
        System.out.println("float: "+obj.f); 
        System.out.println("char: "+obj.ch); 
        System.out.println("double: "+obj.d);
        System.out.println("boolean: "+obj.status);
        System.out.println("string: "+obj.str);
    }
}