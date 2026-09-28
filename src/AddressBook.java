import java.util.ArrayList;
import java.util.List;

/**
 * A simple address book that stores BuddyInfo contacts.
 * Lab 3, Part 1: used to practice using the IntelliJ debugger.
 */
public class AddressBook {
    private List<BuddyInfo> buddies;
    private int size;

    public AddressBook() {
        buddies = new ArrayList<>();
        size = 0;
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
        size++;
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
        size++;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy = new BuddyInfo("Homer", "613-555-1234");
        System.out.println("Buddy before add: " + buddy);

        addressBook.addBuddy(buddy);  // <-- set the breakpoint on this line

        System.out.println("Address book size: " + addressBook.getSize());
    }
}
