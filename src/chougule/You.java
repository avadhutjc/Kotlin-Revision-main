package chougule;

import avadhut.Just;

public class You extends Just {

    @Override
    public void CoolSong() {
        //super.CoolSong();
        System.out.println("after");
    }

    public static void main(String[] args) {
        Just just = new Just();
        just.CoolSong();
        You you = new You();

        //If you need to determine exactly which class your object is: use getClass() method
        System.out.println(you.getClass());

    }
}
