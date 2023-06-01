public class Child {
    String name;
    int age;
    Adult parent;

    public Child(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Child(String name, int age, Adult parent){
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Adult getParent() {
        return this.parent;
    }
}
