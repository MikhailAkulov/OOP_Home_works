package OOP_Home_work_5;

public interface AdminFunctions extends ModeratorFunctions{
    public void removeUserFromChat(Person person);
    public void addUserInChat(Person person, Conversation chat);
    public void giveRole(Person person);
}
