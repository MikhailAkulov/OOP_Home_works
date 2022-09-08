package OOP_Home_work_3;

public class Link {
    private Person personFirst;
    private Person personSecond;
    private Relation link;

    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Person getPersonFirst() {
        return personFirst;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getLink() {
        return link;
    }

    @Override
    public String toString() {
        return String.format("%s are %s for %s", this.personFirst.getName() + " " + this.personFirst.getSurname(),
                this.link, this.personSecond.getName() + " " + this.personSecond.getSurname());
    }
}
