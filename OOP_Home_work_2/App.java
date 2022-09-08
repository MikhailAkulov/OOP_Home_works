package OOP_Home_work_2;

public class App {

    public static void main(String[] args) {

        HumanTree peoples = new HumanTree();

        peoples.add(new DogLover("Misha", 34));
        peoples.add(new CatLover("Vika", 32));

        System.out.println("List of humans:\n" + peoples);

        AnimalTree animals = new AnimalTree();
        animals.add(new Cat("Bikky", 4));
        animals.add(new Dog("Pluto", 10));

        System.out.println("List of animals:\n" + animals);

        Research.getCatLovers(peoples);
        Research.getDogLovers(peoples);
        Research.getCats(animals);
        Research.getDogs(animals);
        Research.getAction(peoples, animals, null);
    }
}
