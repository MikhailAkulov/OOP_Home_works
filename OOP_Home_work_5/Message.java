package OOP_Home_work_5;

// import java.time.LocalDate;

public class Message {
    Person person;
    String message;
//    LocalDate date;

    public Message(Person person, String message) {
        this.person = person;
        this.message = message;
//        this.date = date;
    }

    @Override
    public String toString() {
        return person.nickName + ":" + " " + message;
    }
}