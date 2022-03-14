public class Patiente {
    //Atributos
    private String name;
    private String email;
    String address;
    private int phoneNumber;
    String birthday;
    private double height;
    private double weight;
    private String blood;

    //Métodos
    Patiente(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        String phoneNumber2 = String.valueOf(phoneNumber);
        if (phoneNumber2.length() < 8) {
            System.out.println("Por favor ingresar un número mayor a 8 digitos");
        } else if (phoneNumber2.length() == 8) {
            this.phoneNumber = phoneNumber;            
        }
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    
}
