class A {
    static int sVar = 0;
    A(){
        sVar++;
    }
    void print()
    {
        System.out.println(sVar);
    }
}

class Main
{
    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A z = new A();
        x.print();
        y.print();
        z.print();
    }
}