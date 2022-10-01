public class Man extends Person{
    private int height;

    public Man(String name, String gender, int age, String profession, String dominantAttribute,
               String preferredGender, int preferredMaxAge, String preferredProfession,
               String preferredDominantAttribute, int height) {
        super(name, gender,age, profession, dominantAttribute, preferredGender, preferredMaxAge, preferredProfession, preferredDominantAttribute);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
