package programming.Oops.Principles.Inheritance;
public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);// what is this ? this calls the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
        System.out.println(l);
    }
}
