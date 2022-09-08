package OOP_Home_work_1;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Aleksandr", "Ak");
        Person person1 = new Person("Zoya", "Ak");
        Person person2 = new Person("Lena", "Ak");
        Person person3 = new Person("Sweta", "Az");
        Person person4 = new Person("AleXandr", "Ch");
        Person person5 = new Person("Lyuba", "Ch");
        Person person6 = new Person("Dima", "Az");
        Person person7 = new Person("Misha", "Ak");
        Person person8 = new Person("Kseniya", "Ak");
        Person person9 = new Person("Ivan", "Az");
        Person person10 = new Person("Sergey", "Az");
        Person person11 = new Person("Aleksey", "Ch");
        Person person12 = new Person("Lida", "Ch");

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

        UI.PrintTree(tree);
    }

}
