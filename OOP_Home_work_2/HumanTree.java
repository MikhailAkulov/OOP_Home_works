package OOP_Home_work_2;

import java.util.ArrayList;
import java.util.List;

public class HumanTree {

    private List<Human> tree = new ArrayList<>();

    public List<Human> getTree() {
        return tree;
    }

    public void add(Human human) {
        tree.add(human);
    }

    @Override
    public String toString() {
        String str = new String();
        for (Human el : tree) {
            str += el.toString() + "\n";
        }
        return str;
    }
}
