package OOP_Home_work_3;

public class Person implements Comparable<Person>{
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, surname, age + "\n");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
