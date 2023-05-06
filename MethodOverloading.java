class MethodOverloading {
    void calValue (){
        int x=20;
        x=x*x;
        System.out.println("sqrt of x is: "+x);
    }
    void calValue(int y){
        y=y*y*y;
        System.out.println("cube of y is: "+y);
    }
    void calValue(int m,int n){
        int z=m*n;
        System.out.println("product of m and n is: "+z);
    }
    public static void main(String args[]){
        MethodOverloading m= new MethodOverloading();
        m.calValue();
        m.calValue(10, 20);
        m.calValue(10);
    }
    
}
