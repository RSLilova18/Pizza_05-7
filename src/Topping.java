public class Topping {

    private String name; // meso, zelenchuci, sirene, sos
    private double weight;


    public Topping(){

        this.name = "meso";
        this.weight = 70;
    }

    public Topping(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
