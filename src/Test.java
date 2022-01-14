public class Test {

    public static void main(String[] args) {

        String value = "abc";

        changeValue(value);

        System.out.println(value);

    }

    public static void changeValue(String a) {

        a = "xyz";

    }

}

/*
public class Test {
    public static void main(String[] args) {
        System.out.println(10 / 3 > 3 ? "MORE" : 10 / 4 < 3 ? "LESS" : "MORE");
    }
}
 */