/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import com.Product;
import java.util.Scanner;

/**
 *
 * @author HAU NUONG MO HANH
 */
public class LL_ProList extends DLL {
    Scanner sc = null;

    public LL_ProList() {
        super();
        sc = new Scanner(System.in);
    }
    
    private DLLNode<Product> find (String code) {
        DLLNode<Product> ref;
        for (ref = this.getHead(); ref != null; ref = ref.next) {
            if (ref.info.getCode().equals(code)) {
                return ref;
            }
        }
        return null;
    }
    
    public void add() {
        String code = "", name = "";
        int price = 0, guaranty = 0;
        System.out.println("Add new product");
        boolean proceed = false;
        //Enter item's code
        do {
            System.out.print("Enter product's code: ");
            code = sc.nextLine().toUpperCase();
            proceed = find(code) != null;
            if (proceed == true) {
                System.out.println("This code is duplicated! ");
            }
        } while (proceed);

        //Enter item's name
        do {
            System.out.print("Enter product's name: ");
            name = sc.nextLine().trim();
            proceed = (name.length() == 0);
            if (proceed == true) {
                System.out.println("Product's name was inputted.");
            }
        } while (proceed);
        //Enter item's price
        do {
            System.out.print("Enter product's price: ");
            price = Integer.parseInt(sc.nextLine());
            if (price <= 0) {
                System.out.println("Product's price must be greater than 0.");
            }
        } while (price <= 0);
        //Enter item's guaranty
        do {
            System.out.print("Enter product's guaranty: ");
            guaranty = Integer.parseInt(sc.nextLine());
            if (guaranty <= 0) {
                System.out.println("Product's guaranty must be greater than 0.");
            }
        } while (guaranty <= 0);
        //Add this employee to the end of the list
        Product pro = new Product(code, name, price, guaranty);
        this.addToTail(pro);
        System.out.print("This item is added.");
    }
    
    public void remove() {
        if (this.isEmpty()) {
            System.out.println("The list is empty. ");
        } else {
            String code = "";
            System.out.print("Enter the code of item which will be removed: ");
            code = sc.next().toUpperCase();
            DLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("It does not exist. ");
            } else {
                this.delete(ref.info);
                System.out.print("This item has been removed. ");
            }
        }
    }
    
    public void updatePrice() {
        if (this.isEmpty()) {
            System.out.println("The list is empty. ");
        } else {
            String code = "";
            System.out.print("Enter the code of price which will be changed:");
            code = sc.nextLine().toUpperCase();
            DLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Item does not exist. ");
            } else {
                int oldPrice = ref.info.getPrice();
                int newPrice;
                do {
                    System.out.print("Old price: " + oldPrice + ", new price: ");
                    newPrice = Integer.parseInt(sc.nextLine());
                } while (newPrice == oldPrice);
                ref.info.setPrice(newPrice);
                System.out.print("This price has been updated. ");
            }
        }
    }
    
    public void updateGuaranty() {
        if (this.isEmpty()) {
            System.out.println("The list is empry. ");
        } else {
            String code = "";
            System.out.print("Enter the code of guaranty which will be changed:");
            code = sc.nextLine().toUpperCase();
            DLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Item does not exist. ");
            } else {
                int oldGuaranty = ref.info.getGuaranty();
                int newGuaranty;
                System.out.print("Old guaranty: " + oldGuaranty + ", new guaranty: ");
                newGuaranty = Integer.parseInt(sc.nextLine());
                ref.info.setGuaranty(newGuaranty);
                System.out.print("This guaranty has been updated. ");
            }
        }
    }
    
    public void print() {
        if (this.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("================================PRODUCT LIST================================");
            this.printAll();
        }
    }
}
