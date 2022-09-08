package OOP_Home_work_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MemberStorage {
    private static final List<ID> idStorage = new ArrayList<>();
    private static Path path = Path.of("C:/Users/Akuloff/Desktop/Geek_Brains/1_Quarter/010_OOP/OOP_Home_works/OOP_Home_work_5/UserDataBase.txt");
    static int count = 0;

    private MemberStorage() {}

    public static List<ID> getIdStorage(){
        return idStorage;
    }

    public static void checkUsersDB() throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(Path.of(String.valueOf(path)));
        } else {
            List<String> readedList = Files.readAllLines(path);
            for (String person: readedList) {
                String[] nickName = person.split(" ");
                idStorage.add(new ID(new User(nickName[0])));
            }
        }
    }

    public static void addUserInFile(Person person) throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(Path.of(String.valueOf(path)));
        }
        String updatedDB = Files.readString(path) + person.nickName + "\n";
        Files.writeString(path, updatedDB);
        System.out.println("writing to file complete");
    }
}