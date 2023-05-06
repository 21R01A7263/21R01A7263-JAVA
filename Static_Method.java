class StaticMethod {
    static int i=100;
    static String S="BegginerBooks";
    static void display(){
        System.out.println("i:"+i);
        System.out.println("s: "+S);
    }
    void funcn(){
        display();
    }
    public static void main(String args[]){
        StaticMethod obj=new StaticMethod();
        obj.funcn();
        display();
    }

}
