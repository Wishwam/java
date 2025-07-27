class Test{
    public static void main(String[]args){
        System.out.println("hello java");
    byte a;
        a=127;
        System.out.println(a);
    double d=(float)55.65;
    System.out.println(d);
// typecasting
    byte q=45;
    double w;
    w = q;
    System.out.println(w);

    }
}

class demo{
    public static void main(String[]args){
        String s1= "java";
        String s2= "java";
        if (s1.equals(s2)){
            System.out.println("string values are equal");
        }
        else{
            System.out.println("string values are not equal");
        }
// 
        String s3 = "JAVA";
        String s4 =new String("JAVA");
        if (s3==s4){
            System.out.println("references are equal");
        }
        else {
            System.out.println("References are not equal");
        }
    }
}