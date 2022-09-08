package OOP_Home_work_2;

public abstract class Animal {

    private final String nickName;
    private final int age;

    public Animal(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Nickname: " + this.nickName + ", age: " + this.age);
    }

    protected boolean fullStomach;

    public abstract void come();

    public abstract void positiveReaction();

    public abstract void negativeReaction();

    public abstract void eat();

    public abstract void ignoring();
}
