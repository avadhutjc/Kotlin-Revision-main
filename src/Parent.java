 public class Parent {

    public Parent() {
        System.out.println("Parent constructor called");
    }

    //you cannot override show() method boz its final method through out program so
    //after extending Parent class you will not see show() method
    //ie. Method cannot be overridden in subclass
    public final void show(Object o) {
        System.out.println("BaseClass method");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor called");
    }
}

class classTestDrive {
    public static void main(String[] args) {
        Child child = new Child();  //true when obj of child class is created constructor of parent class is called first.
//        Parent child = new Parent();  //true
//        Child child1 = new Parent(); //error parent cannot extend child
//        Child child2 = new Child(); //true
    }
}
/*
Parent constructor called
Child Constructor called

Process finished with exit code 0
 */