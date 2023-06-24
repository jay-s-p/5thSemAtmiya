class Demo {
    String name;
    int id;

    Demo() {
        System.out.println("Hi");
    }

    Demo(String name, int id) {
        this(); /* calling default constructor */
        this.name = name;
        this.id = id;
        this.print(this); /* calling print method */
    }

    void print(Demo x) {
        System.out.println(x.name + " " + x.id);
    }

    public static void main(String[] args) {
        Demo a = new Demo("LOL", 143);
    }
}