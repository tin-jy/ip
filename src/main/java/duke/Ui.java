package duke;

import java.util.Scanner;

public class Ui {


    public void showWelcome() {
        System.out.println("Hi I'm duke.Duke! What may I do for you?");
    }

    public void showGoodbye() {
        System.out.println("Bye!");
    }

    public void showLoadingError() {
        System.out.println("Unable to load from file. Check if the file exists and whether it was formatted properly.");
    }

    public void showWritingError() {
        System.out.println("Unable to find file to write to");
    }

    public void display(String output) {
        System.out.println(output);
    }

    public void displayError(Exception e) {
        System.out.println(e.getMessage());
    }

}
