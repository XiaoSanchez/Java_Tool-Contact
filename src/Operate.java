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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Operate {
    private List<Person> list;
    public Operate() {
        this.list = new ArrayList<>();
    }
    public void addLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.addMenu();
            int item = telNoteRegex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.addOperation();
                    break;
                case 2:
                    this.showAll();
                    break;
                case 3:
                    return;
            }
        }
    }
    public void searchLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.searchMenu();
            int item = telNoteRegex.menuItemValidate(1, 7);
            switch (item) {
                case 1:
                    this.searchByName();
                    break;
                case 2:
                    this.searchByAge();
                    break;
                case 3:
                    this.searchBySex();
                    break;
                case 4:
                    this.searchByTelNum();
                    break;
                case 5:
                    this.searchByAdd();
                    break;
                case 6:
                    this.showAll();
                    break;
                case 7:
                    return;
            }
        }
    }
    public void modifyLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.modifyMenu();
            int item = telNoteRegex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.modifyOperation();
                    break;
                case 3:
                    return;
            }
        }
    }
    public void deleteLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.deleteMenu();
            int item = telNoteRegex.menuItemValidate(1, 4);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.deleteOperation();
                    break;
                case 3:
                    this.deleteAllOperation();
                    break;
                case 4:
                    return;
            }
        }
    }
    public void orderLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.orderMenu();
            int item = telNoteRegex.menuItemValidate(1, 5);
            switch (item) {
                case 1:
                    this.orderName();
                    break;
                case 2:
                    this.orderAge();
                    break;
                case 3:
                    this.orderSex();
                    break;
                case 4:
                    this.showAll();
                    break;
                case 5:
                    return;
            }
        }
    }
    public void addOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        String age = telNoteRegex.ageValidate();
        String sex = telNoteRegex.sexValidate();
        String telNum = telNoteRegex.telNumValidate();
        String address = telNoteRegex.addressValidate();
        Person person = new Person(name, age, sex, telNum, address);
        this.list.add(person);
        person.setId(this.list.size());
    }
    public void showAll() {
        if (this.list.size() == 0) {
            System.out.println("No Log");
            return;
        }
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }
    public void searchByName() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(this.list.get(i).getName())) {
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No Result");
        }
    }
    public void searchByAge() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (age.equals(this.list.get(i).getAge())) {
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No Result");
        }
    }
    public void searchBySex() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String sex = telNoteRegex.sexValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (sex.equalsIgnoreCase(this.list.get(i).getSex())) {
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No Result");
        }
    }
    public void searchByTelNum() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNumValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (telNum.equals(this.list.get(i).getTelNum())) {
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No Result");
        }
    }
    public void searchByAdd() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (address.equals(this.list.get(i).getAddress())) {
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("No Result");
        }
    }
    public void modifyOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu = new Menu();
        System.out.println("Enter Index");
        int itemNum = telNoteRegex.menuItemValidate(1, this.list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegex.menuItemValidate(1, 6);
        switch (menuItem) {
            case 1:
                String name = telNoteRegex.nameValidate();
                (this.list.get(itemNum - 1)).setName(name);
                break;
            case 2:
                String age = telNoteRegex.ageValidate();
                (this.list.get(itemNum - 1)).setAge(age);
                break;
            case 3:
                String sex = telNoteRegex.sexValidate();
                (this.list.get(itemNum - 1)).setSex(sex);
                break;
            case 4:
                String telNum = telNoteRegex.telNumValidate();
                (this.list.get(itemNum - 1)).setTelNum(telNum);
                break;
            case 5:
                String address = telNoteRegex.addressValidate();
                (this.list.get(itemNum - 1)).setAddress(address);
                break;
            case 6:
                return;
        }
    }
    public void deleteOperation() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        System.out.println("Enter Index");
        int itemNum = telNoteRegex.menuItemValidate(1, this.list.size());
        this.list.remove(itemNum - 1);
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
        System.out.println("Successfully Deleted");
    }
    public void deleteAllOperation() {
        this.list.clear();
        System.out.println("Empty!");
    }
    public void orderName() {
        Collections.sort(this.list, new OrderByName());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }
    public void orderAge() {
        Collections.sort(this.list, new OrderByAge());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }
    public void orderSex() {
        Collections.sort(this.list, new OrderBySex());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
    }
    class OrderByName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    class OrderByAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
    class OrderBySex implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }
}
