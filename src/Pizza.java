public class Pizza {
    private String Name;
    private String Dought;
    private String Topping;


    public Pizza (){
        this.Name = "Margarita";
        this.Dought = "Bqlo";
        this.Topping = "Sirene";
    }


    public Pizza(String name, String dought, String topping) {
        Name = name;
        Dought = dought;
        Topping = topping;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDought() {
        return Dought;
    }

    public void setDought(String dought) {
        Dought = dought;
    }

    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Name='" + Name + '\'' +
                ", Dought='" + Dought + '\'' +
                ", Topping='" + Topping + '\'' +
                '}';
    }
}
