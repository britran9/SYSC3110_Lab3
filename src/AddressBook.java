import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyBook;

    public AddressBook() {
        buddyBook = new ArrayList<>();
    }

    public void addBuddyInfo(BuddyInfo b){
        buddyBook.add(b);
    }

    public void removeBuddyInfo(BuddyInfo b){
        buddyBook.remove(b);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy1 = new BuddyInfo("Homer", "Springfield", 999);
        AddressBook book = new AddressBook();
        System.out.printf("Hello " + buddy1.getName());
        book.addBuddyInfo(buddy1);
        book.removeBuddyInfo(buddy1);
    }
}
