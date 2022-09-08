package OOP_Home_work_1;

import java.util.List;

public class Research {
    public static void printParent(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.CHILD) {
                System.out.println(name + " are children: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.PARENT) {
                System.out.println(name + " are parent: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printBrother(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.BROTHER) {
                System.out.println(name + " are brother: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSister(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.SISTER) {
                System.out.println(name + " are sister: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSpouse(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.SPOUSE) {
                System.out.println(name + " are spouse: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printGrandParent(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.GRANDPARENT) {
                System.out.println(name + " are grandparent: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printGrandChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.GRANDCHILDREN) {
                System.out.println(name + " are grandchildren: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printAuntUncle(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.NEPHEW) {
                System.out.println(name + " are nephew: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.NIECE) {
                System.out.println(name + " are niece: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printNephewNiece(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.UNCLE) {
                System.out.println(name + " are uncle: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.AUNT) {
                System.out.println(name + " are aunt: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printCousine(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.COUSINE) {
                System.out.println(name + " are cousine: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSisterInLaw(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.SISTER_IN_LAW) {
                System.out.println(name + " are sister-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printBrotherInLaw(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.BROTHER_IN_LAW) {
                System.out.println(name + " are brother-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printParentInLaw(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.DAUGHTER_IN_LAW) {
                System.out.println(name + " are daughter-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.SON_IN_LAW) {
                System.out.println(name + " are son-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printChildrenInLaw(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.MOTHER_IN_LAW) {
                System.out.println(name + " are mother-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == Relation.FATHER_IN_LAW) {
                System.out.println(name + " are father-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }
}
