public class swap {
    public static void main(String[] args){

       withTemporary(7,8);
       withoutTempVariable(10,3);
    }
    public static void withTemporary(int a,int b){
        System.out.println("before swap a:"+a+" and "+ " b: "+b);
        int tem=a;
        a=b;
        b=tem;
        System.out.println("After swap a:"+a+" and "+ " b: "+b);
    }
    public static void withoutTempVariable(int a,int b){
        System.out.println("before swap a:"+a+" and "+ " b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("before swap a:"+a+" and "+ " b: "+b);

       // b=a-
    }
}
