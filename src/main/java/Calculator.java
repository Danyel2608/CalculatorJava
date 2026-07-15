public class Calculator {
    //Attributes

    //Methods
    public int plus(int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if (b!=0 && a!=0){
            return a/b;
        }else {
            System.err.println("Error: Division by zero");
            return -1;
        }
    }
}
