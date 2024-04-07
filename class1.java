class calculator{
    int a;
    
    public int add(int n,int m){
        int r=n+m;
        return r;

    }
}

public class class1 {
    public static void main(String[] args) {
        int num1=34;
        int num2=45;
        calculator cal=new calculator();
        int result=cal.add(num1, num2);
        System.out.println(result);


    }
}
