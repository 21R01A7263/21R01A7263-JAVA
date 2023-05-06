class Staticmember {
    static int var1=77;
    int var3 = 66;
    String var2;
    public static void main(String args[]){
        Staticmember ob1=new Staticmember();
        Staticmember ob2=new Staticmember();
        ob1.var1=88;
        ob1.var2="i am object";
        ob2.var1=var1;
        ob2.var2="another object";
        System.out.println("ob1 integer: "+ob1.var1);
        System.out.println("ob1 string: "+ob1.var2);
        System.out.println("ob2 integer: "+ob2.var1);
        System.out.println("ob2 string: "+ob2.var2);
        

    }
}
