public class Arithmetic {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        int num3 = 3;

        int res1 = num1+num2;
        int res2 = num1-num2;
        int res3 = num1/num2;
        int res4 = num1*num2;
        int res5 = num1%num3; // остаток от деления
        int res6 = num1/num3;
        int res7 = num1-num3++; // сначала res7 = 7, num3=3+1
        int res8 = num1 - ++num2; // сначала num2 = num2+1, res8 = 10-6 (C -- аналогично)

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(num3);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(num2);
        System.out.println(res8);
        System.out.println(num2);
    }

}
