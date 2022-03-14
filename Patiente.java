public class Patiente extends User {
    //Atributos
    
    String birthday;
    private double height;
    private double weight;
    private String blood;

    //Métodos
    Patiente(String name, String email){
        super(name, email);
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
