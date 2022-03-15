public class Patiente extends User {
    //Atributos
    
    String birthday;
    private double height;
    private double weight;
    private String blood;

    //Métodos
    public Patiente(String name, String email){
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood; 
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Paciente");
        System.out.println("Historial desde Nacimiento");
    }

        
}
