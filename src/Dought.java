public class Dought {

    private String name; //bqlo ili oylnozyrnesto
    private String type; //hrupkavo, duvchene, domashno
    private double weight;


    public Dought (){
        this.name = "Bqlo";
        this.type = "hrupkavo";
        this.weight = 20;
    }

    public Dought(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dought{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
