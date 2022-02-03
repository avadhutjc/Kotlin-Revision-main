public class JavaGC {
    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        JavaGC obj = new JavaGC();
        JavaGC obj1 = new JavaGC();
        obj = null;
        obj1 = null;
        System.gc();
    }
}
/*
object is garbage collected
object is garbage collected
Process finished with exit code 0
*/

//Ex. By creating anonymous object
//public class JavaGC {
//    public void finalize() {
//        System.out.println("object is garbage collected");
//    }
//
//    public static void main(String[] args) {
//        new JavaGC(); //creating anonymous obj
//        System.gc();
//    }
//}
///*
//object is garbage collected
//Process finished with exit code 0
//*/
