package OOP_Home_work_2;

import java.util.List;

public class Research {

    public static void getDogLovers(HumanTree humans) {
        List<Human> tree = humans.getTree();
        System.out.println("List of dog lovers: ");
        for (Human human : tree) {
            if (human instanceof DogLover) {
                System.out.println(human);
            }
        }
        System.out.println();
    }

    public static void getCatLovers(HumanTree humans) {
        List<Human> tree = humans.getTree();
        System.out.println("List of cat lovers: ");
        for (Human human : tree) {
            if (human instanceof CatLover) {
                System.out.println(human);
            }
        }
        System.out.println();
    }

    public static void getCats(AnimalTree animals) {
        List<Animal> tree = animals.getTree();
        System.out.println("List of cats: ");
        for (Animal animal : tree) {
            if (animal instanceof Cat) {
                System.out.println(animal);
            }
        }
        System.out.println();
    }

    public static void getDogs(AnimalTree animals) {
        List<Animal> tree = animals.getTree();
        System.out.println("List of dogs: ");
        for (Animal animal : tree) {
            if (animal instanceof Dog) {
                System.out.println(animal);
            }
        }
        System.out.println();
    }

    public static void getAction(HumanTree humans, AnimalTree animals, Commands command) {
        List<Human> peoples = humans.getTree();
        List<Animal> pets = animals.getTree();
        for (Human human : peoples) {
            for (Animal animal : pets) {
                if (human instanceof DogLover) {
                    ((DogLover) human).call(animal, Commands.KISKIS);
                    ((DogLover) human).call(animal, Commands.COME);
                    ((DogLover) human).call(animal, Commands.WHISTLE);
                    ((DogLover) human).call(animal, Commands.WALK);
                    ((DogLover) human).call(animal, Commands.BATHE);
                    ((DogLover) human).call(animal, Commands.EAT);
                    ((DogLover) human).call(animal, Commands.EAT);
                } else if (human instanceof CatLover) {
                    ((CatLover) human).call(animal, Commands.KISKIS);
                    ((CatLover) human).call(animal, Commands.COME);
                    ((CatLover) human).call(animal, Commands.WHISTLE);
                    ((CatLover) human).call(animal, Commands.WALK);
                    ((CatLover) human).call(animal, Commands.BATHE);
                    ((CatLover) human).call(animal, Commands.EAT);
                    ((CatLover) human).call(animal, Commands.EAT);
                }
                System.out.println("---------------------------");
            }
        }
    }

}
