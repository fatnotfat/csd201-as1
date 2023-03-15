/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import com.Menu;

/**
 *
 * @author HAU NUONG MO HANH
 */
public class LL_Product_Program {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new product");
        menu.add("Remove an product");
        menu.add("Update price of an product");
        menu.add("Update guaranty of an product");
        menu.add("Print products list");
        menu.add("Quit");
        LL_ProList proList = new LL_ProList();
        int userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch(userChoice) {
                case 1: 
                    proList.add();
                    break;
                case 2:
                    proList.remove();
                    break;
                case 3:
                    proList.updatePrice();
                    break;
                case 4:
                    proList.updateGuaranty();
                    break;
                case 5:
                    proList.print();
                    break;
            }
        }while (userChoice > 0 && userChoice < 6);
        System.out.println("By Nguyen Tien Phat - SE160374");
    }
}
