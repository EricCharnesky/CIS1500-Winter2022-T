package files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to (1)update/create a file or (2)read a file?");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("1")) {

            System.out.println("Enter the name of the class to save the list to");
            String className = keyboard.nextLine();

            File file = new File(className + ".txt");

            if (!file.exists()) {

                ArrayList<Student> students = new ArrayList<>();
                addStudentsToList(keyboard, students);

                writeFile(className, students);
            } else {
                ArrayList<Student> students = new ArrayList<>();

                readFileIntoList(file, students);

                System.out.println("Names currently in the file: ");
                for (Student student : students) {
                    System.out.println(student.getName());
                }

                System.out.println("Do you want to add any? y/n");
                String add = keyboard.nextLine();
                if (add.equalsIgnoreCase("y")) {
                    addStudentsToList(keyboard, students);
                }

                writeFile(className, students);
            }
        } else if (choice.equalsIgnoreCase("2")) {
            ArrayList<Student> students = new ArrayList<>();
            System.out.println("Enter the name of the class to read");
            String className = keyboard.nextLine();

            File file = new File(className + ".txt");
            readFileIntoList(file, students);

            for (Student student : students) {
                System.out.println("Name: " + student.getName() + " Score: " + student.getScore());
            }
        }

    }

    private static void readFileIntoList(File file, ArrayList<Student> students) {
        try {
            // opening the file
            BufferedReader inputFile = new BufferedReader(new FileReader(file));

            // read the file
            String line = inputFile.readLine();
            while (line != null) {
                if (!line.isEmpty()) {
                    // https://www.programming-free.com/2015/09/java-string-spilit-with-pipe-character.html#:~:text=%20Java%20String%20Split%20with%20Pipe%20Character%20Not,values.%203%20Use%20StringTokenizer%20to%20Split%20More%20?msclkid=d832e2acaa3a11ecb38c1215dae52524
                    String[] values = line.split("\\|");
                    students.add(new Student(values[0], Integer.parseInt(values[1])));
                }
                line = inputFile.readLine();
            }

            // close the file
            inputFile.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void addStudentsToList(Scanner keyboard, ArrayList<Student> students) {
        System.out.println("Enter a student name or DONE to be all done");
        String name = keyboard.nextLine();
        System.out.println("Enter their score");
        int score = Integer.parseInt(keyboard.nextLine());

        while (!name.equalsIgnoreCase("done")) {
            students.add(new Student(name, score));
            System.out.println("Enter a student name or DONE to be all done");
            name = keyboard.nextLine();
            System.out.println("Enter their score");
            score = Integer.parseInt(keyboard.nextLine());
        }
    }

    private static void writeFile(String className, ArrayList<Student> students) {
        try {
            // opens the file - will erase any existing content
            PrintWriter fileOutput = new PrintWriter(new BufferedWriter(new FileWriter(className + ".txt")
                    // optional append mode
                    // new FileWriter(className + ".txt", true)
            ));

            // write to the file
            for (Student student : students) {
                fileOutput.println(student.getStringForFileOutput());
            }

            // close the file
            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void fileExample() {
        try {
            // opens the file - will erase any existing content
            PrintWriter fileOutput = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));

            // write to the file
            fileOutput.println("test test test");
            fileOutput.println("123");


            // close the file
            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }

        File file = new File("test.txt");

        if (file.exists()) {

            try {
                // opening the file
                BufferedReader inputFile = new BufferedReader(new FileReader(file));

                // read the file
                String line = inputFile.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = inputFile.readLine();
                }

                // close the file
                inputFile.close();

            } catch (IOException ex) {
                System.out.println(ex);
            }


        }
    }
}
