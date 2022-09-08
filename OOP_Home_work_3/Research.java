package OOP_Home_work_3;

public class Research {

    public static void getRelation(String name, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getPersonFirst().getName().equals(name)) {
                System.out.println(el);
            }
        }
    }

    public static void getRelation(Relation relation, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getLink() == relation) {
                System.out.println(el);
            }
        }
    }

    public static void getRelation(Person person, Relation relation, Tree tree) {
        for (Link el : tree.getLinks()) {
            if (el.getPersonFirst().getName().equals(person.getName())
                    && el.getPersonFirst().getSurname().equals(person.getSurname()) && el.getLink() == relation) {
                System.out.println(el);
            }
        }
    }
}
