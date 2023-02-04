package com.lockedme;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int choice, option;
        String fname;
        MyFile file = new MyFile();
        FileOperations fo = new FileOperations();
        System.out.println("------------------------------------");
        System.out.println("WelCome to LockeMe.com Project");
        do {
            System.out.println("------------------------------------\n");
            System.out.println(" $$ APPLICATION'S MAIN MENU $$ \n");
            System.out.println("1.To Retrive files from application");
            System.out.println("2.To Perform Operations on Application");
            System.out.println("3.Close the Application");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: // to display the files
                    fo.displayfiles();
                    break;
                case 2:
                    System.out.println("------------------------------------\n");
                    System.out.println(" $$ OPERATIONAL MENU $$ \n");
                    System.out.println("1.Add file to application");
                    System.out.println("2.Delete file from Application");
                    System.out.println("3.Search file from Application");
                    System.out.println("4.Return to Previous Menu");
                    System.out.println("Enter your Choice of operation");
                    option = sc.nextInt();
                    System.out.println("-------------------");
                    switch (option) {
                        case 1: // to add the files
                            System.out.println("Enter the file name:");
                            fname = sc.next();
                            fo.addfile(fname);
                            break;
                        case 2: // to delete the files
                            System.out.println("Enter the file name to delete:");
                            fname = sc.next();
                            fo.deletefile(fname);
                            break;
                        case 3: // to search the files
                            System.out.println("Enter the file name to search:");
                            fname = sc.next();
                            fo.searchfile(fname);
                            break;
                        case 4: // return to main menu
                            System.out.println("Returning to main menu");
                            break;
                        default:
                            System.out.println("Entered wrong Choice. Returning to main menu");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Closing Application");
                    break;
                default:
                    System.out.println("Entered wrong Choice. Closing Application");
                    break;
            }

        } while (choice < 3);
    }
}
