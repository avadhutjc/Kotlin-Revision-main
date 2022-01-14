public class StaticMethod {

    public static void HotBomb() {
        System.out.println("HotBomb Called");
    }

    public void CoolBomb() {
        System.out.println("Cool Bomb Called");
    }

    public static void main(String[] args) {
        StaticMethod.HotBomb(); //accessing without creating  obj bcz its static method declaration
        StaticMethod obj = new StaticMethod(); //accessing it  with creating obj bcoz method is not static
        obj.CoolBomb();
    }
}