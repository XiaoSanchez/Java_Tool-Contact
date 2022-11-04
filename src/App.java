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
public class App {
    public void start() {
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        while (true) {
            menu.mainMenu();
            int item = regex.menuItemValidate(1, 6);
            switch (item) {
                case 1:
                    operate.addLogic();
                    break;
                case 2:
                    operate.searchLogic();
                    break;
                case 3:
                    operate.modifyLogic();
                    break;
                case 4:
                    operate.deleteLogic();
                    break;
                case 5:
                    operate.orderLogic();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}
