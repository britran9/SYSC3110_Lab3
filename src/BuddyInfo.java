public class BuddyInfo {
    /*adding comment*/

    private String name;
    private String address;
    private int phone_number;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhone_number() {
        return phone_number;
    }

    public BuddyInfo(String name, String address, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;

    }
    public BuddyInfo(){
        name = "default name";
        this.phone_number = 111;
        this.address = "default address";
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
