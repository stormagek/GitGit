package test;

public class A
{
    public void printInt (int i)
    {
        System.out.println(i);
    }

    public static void main (String[] args)
    {
        A a1 = new A();
        B b1 = new B();
        a1.printInt(5);
        System.out.println(b1.calcAddition(4, 9));
    }
}
