/*
 * @Description: 
 * @Logo:                                                               ▄   ▄
 * ░██████╗██╗░░██╗░█████╗░░██╗░░░░░░░██╗███╗░░██╗  ░█████╗░░█████╗░██╗ █▀█▀█
 * ██╔════╝██║░░██║██╔══██╗░██║░░██╗░░██║████╗░██║  ██╔══██╗██╔══██╗██║ █▄█▄█
 * ╚█████╗░███████║███████║░╚██╗████╗██╔╝██╔██╗██║  ██║░░╚═╝███████║██║ ███  ▄▄
 * ░╚═══██╗██╔══██║██╔══██║░░████╔═████║░██║╚████║  ██║░░██╗██╔══██║██║ ████▐█ █
 * ██████╔╝██║░░██║██║░░██║░░╚██╔╝░╚██╔╝░██║░╚███║  ╚█████╔╝██║░░██║██║ ████   █
 * ╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝░░╚══╝  ░╚════╝░╚═╝░░╚═╝╚═╝ ▀▀▀▀▀▀▀
 * @Author: Shawn C
 * Copyright (c) 2022 by Shawn C., All Rights Reserved. 
 */
import java.util.Scanner;
public class TelNoteRegex {
    public int menuItemValidate(int min, int max) {
        String regex = "[1-9]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Valid Number, Min: " + min + "\t" + "Max: " + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("Error: Try Again!");
                }
            } else {
                System.out.println("Wrong Number!");
            }
        }
    }
    public String nameValidate() {
        String regex = "[a-zA-Z]{1,10}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Valid Number!");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Error: Try Again!");
            }
        }
    }
    public String ageValidate() {
        String regex = "[1-9]{1}[0-9]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Age Between: 10 - 99");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Error: Try Again!");
            }
        }
    }
    public String sexValidate() {
        String regex = "[m|M|f|F]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Gender: F/M, f/m");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Error: Try Again!");
            }
        }
    }
    public String telNumValidate() {
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Cell Number");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Error: Try Again!");
            }
        }
    }
    public String addressValidate() {
        String regex = "\\w{1,50}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Address within 50 char");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Error: Try Again!");
            }
        }
    }
    public static void main(String[] args) {
        TelNoteRegex regex = new TelNoteRegex();
        String address = regex.addressValidate();
        System.out.println(address);
    }
}
