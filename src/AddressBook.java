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
    }
}
