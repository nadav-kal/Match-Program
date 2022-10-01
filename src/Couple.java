public class Couple {
    private Person firstPerson;
    private Person secondPerson;
    private int rate;

    public Couple(Person firstPerson, Person secondPerson, int rate) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void printCoupleAndRate() {
        System.out.println("(" + this.firstPerson.getName() + "," + this.secondPerson.getName() + ") Rate: " +
                this.rate);
    }
}
