public interface OnClick {

     default void ab() {
        System.out.println("cool");
    }

    default void Cool() {
        System.out.println("gajga");
    }
}

class Two implements OnClick {

    @Override
    public void ab() {
        System.out.println("sdjd");
    }

    @Override
    public void Cool() {
        System.out.println("faf");
    }
}
