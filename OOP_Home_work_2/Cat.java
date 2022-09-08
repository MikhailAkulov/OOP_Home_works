package OOP_Home_work_2;

/*
 * описываем кошку
 */
public class Cat extends Animal {

    public Cat(String nickName, int age) {
        super(nickName, age);
    }

    @Override
    public void come() {
        System.out.println("Cat: goes");
    }

    @Override
    public void positiveReaction() {
        System.out.println("Cat: Meow-meow");
    }

    @Override
    public void negativeReaction() {
        System.out.println("Cat: F-f-r-r-r");
    }

    @Override
    public void eat() {
        if (!fullStomach) {
            System.out.println("Hungry cat: eating");
            fullStomach = true;
        } else {
            System.out.println("Well-fed cat: don't eating");
            fullStomach = false;
        }
    }

    @Override
    public void ignoring() {
        System.out.println("Cat: Contemptuous look");
    }
}
