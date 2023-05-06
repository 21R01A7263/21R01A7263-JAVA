class parent{
    void walk(){
        System.out.println("father is walking slowly");
    }
}
class son extends parent{
    void walk(){
        System.out.println("son is walking fast");
    }
}




class overriding {
    public static void main(String args[]){
        parent p1=new parent();
        p1.walk();
        son s1=new son();
        s1.walk();
    }
    
}
