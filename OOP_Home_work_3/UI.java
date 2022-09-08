package OOP_Home_work_3;

import java.util.Scanner;

public class UI {

    public static void PrintTree(Tree tree) {
        System.out.print("Enter the name of the family member whose family ties you want to show: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        Research.getRelation(name, tree);
    }
}
