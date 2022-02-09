package project2;

public class Project2 {

    // class level variable, accessible EVERYWHERE in the class
    static int energy = 10;

    public static void main(String[] args) {
        displayIntroStory();

        String action = askTheUserWhatTheyWantToDo();
        int numberOfTurns = 1;

        while (!action.equalsIgnoreCase("someEscapeWord")) {
            doAction(action);
            action = askTheUserWhatTheyWantToDo();
        }

        System.out.println("Congrats you escaped our terrible game!");
        System.out.println("It took you " + numberOfTurns + " to get out!");
    }

    public static void doAction(String action) {
        if (action.equalsIgnoreCase("help")) {
            displayHelp();
        } else if (action.equalsIgnoreCase("sleep")) {
            energy = 10;
        } else {
            System.out.println("You can't do that right now");
        }
    }

    public static void displayHelp() {
        // TODO
    }

    public static void displayIntroStory() {
        // TODO
    }

    public static String askTheUserWhatTheyWantToDo() {
        // TODO 
        return "";
    }

}
