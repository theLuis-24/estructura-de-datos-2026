package model;

public class Contact {
    private String fullName;
    private String phoneNuMBER;


    public Contact(String fullName, String phoneNuMBER) {
        this.fullName = fullName;
        this.phoneNuMBER = phoneNuMBER;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNuMBER() {
        return phoneNuMBER;
    }

    public void setPhoneNuMBER(String phoneNuMBER) {
        this.phoneNuMBER = phoneNuMBER;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNuMBER='" + phoneNuMBER + '\'' +
                '}';
    }
}
