
public class A extends B {

    public static void main(String[] args) {

        Short myNum = 7;

        System.out.println(add(myNum, 6));

    }

}

class B {

    static int add(int x, int y) {
        return x + y;
    }

}