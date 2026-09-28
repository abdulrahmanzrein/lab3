/**
 * A simple contact (name and phone number).
 */
public class BuddyInfo {
    private String name;
    private String phone;

    public BuddyInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + " (" + phone + ")";
    }
}
