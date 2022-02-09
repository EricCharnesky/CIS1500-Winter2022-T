
package project2;

public class Project2 {

    public static void main(String[] args) {
        displayIntroStory();
        
        String action = askTheUserWhatTheyWantToDo();
        int numberOfTurns = 1;
        
        while ( !action.equalsIgnoreCase("someescapeword")){
            if ( action.equalsIgnoreCase("help")){
                displayHelp();
            } else if ( action.equalsIgnoreCase("sleep")){
                // TODO
            } else{
                System.out.println("You can't do that right now");
            }
            action = askTheUserWhatTheyWantToDo();
        }
        
        System.out.println("Congrats you escaped our terrible game!");
        System.out.println("It took you " + turns + " to get out!");
    }
    
    public static void displayHelp(){
        // TODO
    }
    
    public static void displayIntroStory() {
        // TODO
    }
    
    public static String askTheUserWhatTheyWantToDo(){
        // TODO 
        return "";
    }
    
}
