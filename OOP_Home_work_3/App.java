package OOP_Home_work_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Aleksandr", "Ak", 90);
        Person person1 = new Person("Zoya", "Ak", 86);
        Person person2 = new Person("Lena", "Ak", 63);
        Person person3 = new Person("Sweta", "Az", 61);
        Person person4 = new Person("Alexandr", "Ch", 64);
        Person person5 = new Person("Lyuba", "Ch", 68);
        Person person6 = new Person("Dima", "Az", 65);
        Person person7 = new Person("Misha", "Ak", 34);
        Person person8 = new Person("Kseniya", "Ak", 38);
        Person person9 = new Person("Ivan", "Az", 32);
        Person person10 = new Person("Sergey", "Az", 25);
        Person person11 = new Person("Aleksey", "Ch", 95);
        Person person12 = new Person("Lida", "Ch", 96);

        Tree tree = new Tree();
        tree.addLink(person, person1, Relation.SPOUSE, Relation.SPOUSE);
        tree.addLink(person, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person3, Relation.SISTER, Relation.SISTER);
        tree.addLink(person, person7, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person, person8, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person, person9, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person, person10, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person1, person7, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person1, person8, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person1, person9, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person1, person10, Relation.GRANDPARENT, Relation.GRANDCHILDREN);

        tree.addLink(person11, person12, Relation.SPOUSE, Relation.SPOUSE);
        tree.addLink(person11, person4, Relation.PARENT, Relation.CHILD);
        tree.addLink(person11, person5, Relation.PARENT, Relation.CHILD);
        tree.addLink(person12, person4, Relation.PARENT, Relation.CHILD);
        tree.addLink(person12, person5, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person5, Relation.BROTHER, Relation.SISTER);
        tree.addLink(person11, person7, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person11, person8, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person12, person7, Relation.GRANDPARENT, Relation.GRANDCHILDREN);
        tree.addLink(person12, person8, Relation.GRANDPARENT, Relation.GRANDCHILDREN);

        tree.addLink(person2, person4, Relation.SPOUSE, Relation.SPOUSE);
        tree.addLink(person2, person7, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person8, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person7, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person8, Relation.PARENT, Relation.CHILD);
        tree.addLink(person7, person8, Relation.BROTHER, Relation.SISTER);

        tree.addLink(person3, person6, Relation.SPOUSE, Relation.SPOUSE);
        tree.addLink(person3, person9, Relation.PARENT, Relation.CHILD);
        tree.addLink(person3, person10, Relation.PARENT, Relation.CHILD);
        tree.addLink(person6, person9, Relation.PARENT, Relation.CHILD);
        tree.addLink(person6, person10, Relation.PARENT, Relation.CHILD);
        tree.addLink(person9, person10, Relation.BROTHER, Relation.BROTHER);

        tree.addLink(person2, person9, Relation.AUNT, Relation.NEPHEW);
        tree.addLink(person2, person10, Relation.AUNT, Relation.NEPHEW);
        tree.addLink(person4, person9, Relation.UNCLE, Relation.NEPHEW);
        tree.addLink(person4, person10, Relation.UNCLE, Relation.NEPHEW);
        tree.addLink(person3, person7, Relation.AUNT, Relation.NEPHEW);
        tree.addLink(person3, person8, Relation.AUNT, Relation.NIECE);
        tree.addLink(person5, person7, Relation.AUNT, Relation.NEPHEW);
        tree.addLink(person5, person8, Relation.AUNT, Relation.NIECE);
        tree.addLink(person6, person7, Relation.UNCLE, Relation.NEPHEW);
        tree.addLink(person6, person8, Relation.UNCLE, Relation.NIECE);

        tree.addLink(person7, person9, Relation.COUSINE, Relation.COUSINE);
        tree.addLink(person7, person10, Relation.COUSINE, Relation.COUSINE);
        tree.addLink(person8, person9, Relation.COUSINE, Relation.COUSINE);
        tree.addLink(person8, person10, Relation.COUSINE, Relation.COUSINE);

        tree.addLink(person2, person5, Relation.SISTER_IN_LAW, Relation.SISTER_IN_LAW);
        tree.addLink(person3, person5, Relation.SISTER_IN_LAW, Relation.SISTER_IN_LAW);
        tree.addLink(person3, person4, Relation.SISTER_IN_LAW, Relation.BROTHER_IN_LAW);
        tree.addLink(person2, person6, Relation.SISTER_IN_LAW, Relation.BROTHER_IN_LAW);
        tree.addLink(person4, person6, Relation.BROTHER_IN_LAW, Relation.BROTHER_IN_LAW);

        tree.addLink(person, person4, Relation.FATHER_IN_LAW, Relation.SON_IN_LAW);
        tree.addLink(person, person6, Relation.FATHER_IN_LAW, Relation.SON_IN_LAW);
        tree.addLink(person1, person4, Relation.MOTHER_IN_LAW, Relation.SON_IN_LAW);
        tree.addLink(person1, person6, Relation.MOTHER_IN_LAW, Relation.SON_IN_LAW);
        tree.addLink(person11, person2, Relation.FATHER_IN_LAW, Relation.DAUGHTER_IN_LAW);
        tree.addLink(person12, person2, Relation.MOTHER_IN_LAW, Relation.DAUGHTER_IN_LAW);

        // /**
        // * К домашней работе №1
        // */
        // System.out.println(tree);

        // Research.getRelation(Relation.BROTHER,tree);

        // Research.getRelation(person8,Relation.NIECE, tree);

        // UI.PrintTree(tree);

        // System.out.println("-------------------------------");

        /**
         * Ко домашней работе №2
         */
        List<Person> persons = new ArrayList<>();

        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
        persons.add(person11);
        persons.add(person12);

        System.out.println("исходный вид списка: \n" + persons);

        /**
         * через имплементацию по возрастанию
         */
        persons.sort(new AgeComparator());
        System.out.println("через имплементацию по возрастанию: \n" + persons);

        /**
         * по убыванию
         */
        persons.sort(new AgeComparator().reversed());
        System.out.println("по убыванию: \n" + persons);

        /**
         * через анонимный класс
         */
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });
        System.out.println("через анонимный класс по возрастанию: \n" + persons);

        /**
         * через лямбду
         */
        persons.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("через лямбду по именам в порядке алфавита: \n" + persons);

        /**
         * без явной передачи компоратора
         */
        Collections.sort(persons);
        System.out.println("без явной передачи компоратора: \n" + persons);
    }
}