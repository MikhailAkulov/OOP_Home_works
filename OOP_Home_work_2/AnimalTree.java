package OOP_Home_work_2;

import java.util.ArrayList;
import java.util.List;

public class AnimalTree {

    private List<Animal> tree = new ArrayList<>();

    public List<Animal> getTree() {
        return tree;
    }

    public void add(Animal animal) {
        tree.add(animal);
    }

    @Override
    public String toString() {
        String str = new String();
        for (Animal el : tree) {
            str += el.toString() + "\n";
        }
        return str;
    }
}
