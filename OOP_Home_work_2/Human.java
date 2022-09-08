package OOP_Home_work_2;

/**
 * Описываем модель человека
 */
public abstract class Human {

    protected String name;
    protected int age;
    protected Commands command;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ", age: " + this.age);
    }
}
