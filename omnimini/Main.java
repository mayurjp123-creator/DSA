package omnimini;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Browsermin browsermin=new Browsermin();
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to OmniBrowser v1.0");
        System.out.println("Type 'EXIT' to quit.");

        while (true) {
            System.out.print("\nOmniBrowser > ");
            String cmd = sc.nextLine().trim();

            if (cmd.equalsIgnoreCase("EXIT")) {
                System.out.println("Closing OmniBrowser... Goodbye.");
                break;
            }

            try {
                if (cmd.startsWith("NEW")) {
                    String url = cmd.substring(3).trim();
                    url = url.replace("[", "").replace("]", "");
                    browsermin.newTab(url);
                }
                else if (cmd.startsWith("VISIT")) {
                    String url = cmd.substring(5).trim();
                    url = url.replace("[", "").replace("]", "");
                    browsermin.visit(url);
                }
                else if (cmd.equalsIgnoreCase("BACK")) {
                    browsermin.back();
                }
                else if (cmd.equalsIgnoreCase("FWD")) {
                    browsermin.front();
                }
                else if (cmd.startsWith("TAB")) {
                    int index = Integer.parseInt(cmd.substring(3).trim());
                    browsermin.switchTab(index);
                }
                else if (cmd.equalsIgnoreCase("CLOSE")) {
                    browsermin.closeTab();
                }
                else if (cmd.equalsIgnoreCase("HISTORY")) {
                    browsermin.printhistory();
                }
                else {
                    System.out.println("Unknown Command.");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Command Format.");
            }
        }
        sc.close();
    }
    }
