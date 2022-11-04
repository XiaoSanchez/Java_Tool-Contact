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
public class Menu {
    public void mainMenu() {
        System.out.println("**************************");
        System.out.println("**   1 Add Contact      **");
        System.out.println("**   2 Find Contact     **");
        System.out.println("**   3 Modify Contact   **");
        System.out.println("**   4 Delete Contact   **");
        System.out.println("**   5 Sort Contact     **");
        System.out.println("**   6 Quit             **");
        System.out.println("**************************");
    }
    public void addMenu() {
        System.out.println("**************************");
        System.out.println("**  1 Add new Contact   **");
        System.out.println("**  2 View all Contacts **");
        System.out.println("**  3 Return previous   **");
        System.out.println("**************************");
    }
    public void searchMenu() {
        System.out.println("**************************");
        System.out.println("**  1 Find by name      **");
        System.out.println("**  2 Find by age       **");
        System.out.println("**  3 Search by gender  **");
        System.out.println("**  4 Search by number  **");
        System.out.println("**  5 Search by address **");
        System.out.println("**  6 View all Contacts **");
        System.out.println("**  7 Return previous   **");
        System.out.println("**************************");
    }
    public void modifyMenu() {
        System.out.println("**************************");
        System.out.println("** 1 View all Contacts  **");
        System.out.println("** 2 Modify a Contact   **");
        System.out.println("** 3 Return previous    **");
        System.out.println("**************************");
    }
    public void subModifyMenu() {
        System.out.println("**************************");
        System.out.println("** 1 Modify Name        **");
        System.out.println("** 2 Modify age         **");
        System.out.println("** 3 Modify gender      **");
        System.out.println("** 4 Modify number      **");
        System.out.println("** 5 Change address     **");
        System.out.println("** 6 Return previous    **");
        System.out.println("**************************");
    }
    public void deleteMenu() {
        System.out.println("**************************");
        System.out.println("** 1 View all Contacts  **");
        System.out.println("** 2 Delete a Contact   **");
        System.out.println("** 3 Delete all         **");
        System.out.println("** 4 Return previous    **");
        System.out.println("**************************");
    }
    public void orderMenu() {
        System.out.println("**************************");
        System.out.println("** 1 Sort by name       **");
        System.out.println("** 2 Sort by age        **");
        System.out.println("** 3 Sort by gender     **");
        System.out.println("** 4 View all Contacts  **");
        System.out.println("** 5 Return previous    **");
        System.out.println("**************************");
    }
}
