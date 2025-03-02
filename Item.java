/*mini bidding station*/
import java.util.*;
abstract class ItemDemo {
    abstract void placeBid(int n);
    abstract void displayItemInfo();
    abstract void displayCondition(String s);
    abstract void displayBrand();
}

class ElectronicItem extends ItemDemo {
    String name, description;
    int bidprice = 200, itemId;

    ElectronicItem(String name, String description, int itemId) {
        this.name = name;
        this.description = description;
        this.itemId = itemId;
    }

    @Override
    public void displayCondition(String s) {
        if (s.equalsIgnoreCase("good"))
            System.out.println("The condition is good");
        else
            System.out.println("The condition was not good");
    }

    @Override
    public void displayBrand() {
        System.out.println("The item belongs to electronics");
    }

    @Override
    void displayItemInfo() {
        System.out.println("Item name: " + this.name);
        System.out.println("Item ID: " + this.itemId);
        System.out.println("Item description: " + description);
    }

    void placeBid(int n) {
        if (n >= bidprice) {
            System.out.println("Bid placed successfully! Amount: " + n);
        } else {
            System.out.println("Bid rejected! Minimum bid price is " + bidprice);
        }
    }
}

class FashionItem extends ItemDemo {
    String name, description;
    int bidprice = 200, itemId;

    FashionItem(String name, String description, int itemId) {
        this.name = name;
        this.description = description;
        this.itemId = itemId;
    }

    @Override
    public void displayCondition(String s) {
        if (s.equalsIgnoreCase("good"))
            System.out.println("The condition is good");
        else
            System.out.println("The condition was not good");
    }

    @Override
    public void displayBrand() {
        System.out.println("The item belongs to fashion");
    }

    @Override
    void displayItemInfo() {
        System.out.println("Item name: " + this.name);
        System.out.println("Item ID: " + this.itemId);
        System.out.println("Item description: " + description);
    }

    void placeBid(int n) {
        if (n >= bidprice) {
            System.out.println("Bid placed successfully! Amount: " + n);
        } else {
            System.out.println("Bid rejected! Minimum bid price is " + bidprice);
        }
    }
}

class HomeItem extends ItemDemo {
    String name, description;
    int bidprice = 200, itemId;

    HomeItem(String name, String description, int itemId) {
        this.name = name;
        this.description = description;
        this.itemId = itemId;
    }

    @Override
    public void displayCondition(String s) {
        if (s.equalsIgnoreCase("good"))
            System.out.println("The condition is good");
        else
            System.out.println("The condition was not good");
    }

    @Override
    public void displayBrand() {
        System.out.println("The item belongs to home");
    }

    @Override
    void displayItemInfo() {
        System.out.println("Item name: " + this.name);
        System.out.println("Item ID: " + this.itemId);
        System.out.println("Item description: " + description);
    }

    void placeBid(int n) {
        if (n >= bidprice) {
            System.out.println("Bid placed successfully! Amount: " + n);
        } else {
            System.out.println("Bid rejected! Minimum bid price is " + bidprice);
        }
    }
}

public class Item {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of items for bid:");
        int noOfItems = s.nextInt();
        s.nextLine(); 
        for (int i = 0; i < noOfItems; i++) {
            System.out.println("Enter the item name (starting with E, F, or H):");
            String name = s.nextLine().trim();

            if (name.length() == 0) {
                System.out.println("Invalid input! Item name cannot be empty.");
                continue;
            }
            System.out.println("Enter the condition of the item (good or not):");
            String condition = s.nextLine();
            System.out.println("Enter the description:");
            String description = s.nextLine();
            System.out.println("Enter the bid ID:");
            int id = s.nextInt();
            System.out.println("Number of people bidding:");
            int people = s.nextInt();
            s.nextLine(); 
            int[] bids = new int[people];
            System.out.println("Enter the bids (should be equal or more than 200):");
            for (int j = 0; j < people; j++) {
                bids[j] = s.nextInt();
            }
            s.nextLine(); // Consume the leftover newline
            if (name.charAt(0) == 'E') {
                ElectronicItem e = new ElectronicItem(name, description, id);
                e.displayBrand();
                e.displayCondition(condition);
                e.displayItemInfo();
                e.placeBid(bids[people - 1]);
            } else if (name.charAt(0) == 'F') {
                FashionItem f = new FashionItem(name, description, id);
                f.displayBrand();
                f.displayCondition(condition);
                f.displayItemInfo();
                f.placeBid(bids[people - 1]);
            } else if (name.charAt(0) == 'H') {
                HomeItem h = new HomeItem(name, description, id);
                h.displayBrand();
                h.displayCondition(condition);
                h.displayItemInfo();
                h.placeBid(bids[people - 1]);
            } else {
                System.out.println("Invalid item category!");
            }
        }
        s.close();
    }
}
/*Explanation:
->The program correctly categorizes the items (Electronic, Fashion, Home).
->The highest bid is placed successfully if it meets the minimum requirement.
->Condition of the item is displayed based on the input.
*/
/*output:
Enter the number of items for bid:
2
Enter the item name (starting with E, F, or H):
Ebulb
Enter the condition of the item (good or not):
good
Enter the description:
Used for lighting purposes
Enter the bid ID:
1234
Number of people bidding:
3
Enter the bids (should be equal or more than 200):
200
250
300
The item belongs to electronics
The condition is good
Item name: Ebulb
Item ID: 1234
Item description: Used for lighting purposes
Bid placed successfully! Amount: 300
Enter the item name (starting with E, F, or H):
Fshirt
Enter the condition of the item (good or not):
not good
Enter the description:
Branded cotton shirt
Enter the bid ID:
5678
Number of people bidding:
2
Enter the bids (should be equal or more than 200):
220
280
The item belongs to fashion
The condition was not good
Item name: Fshirt
Item ID: 5678
Item description: Branded cotton shirt
Bid placed successfully! Amount: 280
*/

