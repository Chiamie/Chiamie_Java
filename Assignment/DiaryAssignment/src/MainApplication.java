import MyExceptions.DiaryNotFoundException;
import MyExceptions.InaccessibleDiaryException;
import MyExceptions.InvalidIdException;
import MyExceptions.InvalidPasswordException;

import java.awt.*;
import java.util.Scanner;

public class MainApplication {
    private static Diaries diaries = new Diaries();
    private String username, password;
    private Diary diary;
    private String title, content;
    int iD;

    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        boolean running = true;
        while (running) {
            print("Welcome To Achalugo Diary Application");
            print(displayMenu());
            try {
                String choice = input("Choose a menu option: ");
                app.processChoice(choice);
                if (choice.equals("4")) {
                    running = false;
                }
            } catch (DiaryNotFoundException e) {
                print("Unknown Diary: " + e.getMessage());
            } catch (InaccessibleDiaryException e) {
                print("Inaccessible Diary: " + e.getMessage());
            } catch (InvalidIdException e) {
                print("Invalid ID: " + e.getMessage());
            } catch (InvalidPasswordException e) {
                print("Invalid Password: " + e.getMessage());
            }
            String response = inputCollectsSentence("Return to main menu? yes/no: ");
            if (!response.equals("yes")) break;
        }
    }

    private  void processChoice(String choice) {
        switch (choice) {
            case "1":
                registerAccount();
                String response = input("Do you want to make your first entry: ");
                if (response.equalsIgnoreCase("yes")) addEntry();
                break;
            case "2":
                logIn();
                print(displayExistingUserOptions());
                choice = input("Choose a menu option: ");
                switch (choice) {
                    case "1":
                        addEntry();
                        break;
                    case "2":
                        upDateEntry();
                        break;
                    case "3":
                        deleteEntry();
                        break;
                    case "4":
                        readEntry();
                        break;
                }
                break;
            case "3":
                deleteAcount();
                break;
            case "4":
                print("Goodbye!");
        }

    }

    public  void registerAccount() {
        username = input("Enter your username: ");
        username = collectUsername(username);
        String password = input("Enter your password: ");
        diaries.add(password, username);
    }

    public void logIn() {
        password = input("Enter your password: ");
        username = input("Enter your username: ");
        diary = new Diary(password, username);
        diary.unlockDiary(password);
    }

    public  void addEntry() {
        diary = diaries.findByUsername(username);
        title = inputCollectsSentence("Enter your title: ");
        content = inputCollectsSentence("Enter your content: ");
        diary.createEntry(title, content);
    }

    public  void upDateEntry() {
        diary = diaries.findByUsername(username);
        title = inputCollectsSentence("Enter your title: ");
        content = inputCollectsSentence("Enter your content: ");
        iD = Integer.parseInt(input("Enter your ID"));
        diary.updateEntry(iD, title, content);
    }
    public  void deleteEntry() {
        diary = diaries.findByUsername(username);
        title = inputCollectsSentence("Enter your title: ");
        content = inputCollectsSentence("Enter your content: ");
        iD = Integer.parseInt(input("Enter your ID"));
        diary.deleteEntry(iD);
    }

    public void readEntry() {
        diary = diaries.findByUsername(username);
        iD = Integer.parseInt(input("Enter your ID"));
        System.out.println(diary.findEntryById(iD));
    }

    public void deleteAcount() {
        password = input("Enter your password: ");
        String response = input("Do you want to delete account? ");
        if (response.equalsIgnoreCase("yes")) diaries.delete(password, username);
    }



    public static String displayMenu() {
            return  """
                    1. New User
                        1. Register Account(after creating lock)(Do you want to add your first writeup
                    2. Existing User: Change Password
                    3. Delete Account
                    4. Exit
                    """;
    }

    public static String displayExistingUserOptions() {
        return  """
            1. Add new Diary
            2. Update Diary
            3. Delete Diary
            4. Read Diary
        """;

    }


    public static void displayDermacation(){
        for(int index = 1; index <= 50; index++){
            System.out.println("=");
        }
    }

    public static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.next();
    }

    public static String inputCollectsSentence(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine();
    }

    public static void print(String prompt) {
        System.out.println(prompt);
    }

    private static boolean validateInput(String prompt) {
        if (prompt.isEmpty()) return false;
        return isAlphanumeric(prompt);
    }

    private static boolean isDigit(String prompt) {
        boolean result = false;
        for (int index = 0; index < prompt.length(); index++) {
            if (Character.isDigit(prompt.charAt(index)))
                result = true;
        }
        return result;
    }

    private static boolean isLetter(String prompt) {
        boolean result = false;
        for (int index = 0; index < prompt.length(); index++) {
            if (Character.isLetter(prompt.charAt(index)))
                result = true;
        }
        return result;
    }

    private static boolean isAlphanumeric(String prompt) {
        boolean result = false;
        for (int index = 0; index < prompt.length(); index++) {
            if (isLetter(prompt) && isDigit(prompt))
                result = true;
        }
        return result;
    }

    private static String collectUsername(String username) {
        while (!validateInput(username)) {
            print("Invalid username! Username must be alphanumeric!");
            username = input("Enter your username: ");
        }
        return username;
    }




}
