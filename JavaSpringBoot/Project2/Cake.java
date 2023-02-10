class Cake {
    private String icing;
    private String flavor;

    public Cake(String flavor) {
        this.icing = "chocolate";
        this.flavor = flavor;
    }
    public String getCake() {
        return this.icing + " " + this.flavor;
    }
}
class BirthdayApp {
    public static void main(String[] args) {
        Cake c = new Cake("Vanilla");
        System.out.println(c.getCake());
    }
}