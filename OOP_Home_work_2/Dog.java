package OOP_Home_work_2;

/**
 * описываем собаку
 */
public class Dog extends Animal {

    public Dog(String nickName, int age) {
        super(nickName, age);
    }

    @Override
    public void come() {
        System.out.println("Dog: goes");
    }

    @Override
    public void positiveReaction() {
        System.out.println("Dog: Woof-woof");
    }

    @Override
    public void negativeReaction() {
        System.out.println("Dog: B-b-r-r-r");
    }

    @Override
    public void eat() {
        if (!fullStomach) {
            System.out.println("Hungry dog: eating");
            fullStomach = true;
        } else {
            System.out.println("Well-fed dog: don't eating");
            fullStomach = false;
        }
    }

    @Override
    public void ignoring() {
        System.out.println("Dog: Contemptuous look");
    }
}
