/**
 * User
 */
public abstract class User {

    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    
    public User(String name, String email) {
        this.setName(name);
        this.setEmail(email);
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        String phoneNumber2 = String.valueOf(phoneNumber);
        if (phoneNumber2.length() < 8) {
            System.out.println("Por favor ingresar un número mayor a 8 digitos");
        } else if (phoneNumber2.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "User: " + name + ", Email: " + email +
                "\nAddress: " + address + ". Phone: " + phoneNumber;
    }
    
    public abstract void showDataUser();
}