package menu;

import actions.Action;
import actions.FeedAction;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {

            System.out.println("Here are the available actions:");
            char option = 'a';
            for (Action action : actions) {
                System.out.println(option + ": " + action.menuDescription());
                option++;
            }
            System.out.println("x: Exit the farm");


            System.out.println("Choose an option: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("x")) {
                break;
            }


           try{ if (input.length() == 1) {
                int index = input.charAt(0) - 'a';
                if (index >= 0 && index < actions.size()) {
                    System.out.println(actions.get(index).execute());
                } else {
                    System.out.println("Invalid option. Try again.");
                }
            } else {
                throw new Exception("Invalid input length");
            }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

            System.out.println();

        } while (true);

        System.out.println("Thank you for visiting our Magic Farm!");
    }
}