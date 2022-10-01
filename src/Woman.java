public class Woman extends Person{

    private String hairColor;

    public Woman(String name, String gender, int age, String profession, String dominantAttribute,
                 String preferredGender, int preferredMaxAge, String preferredProfession,
                 String preferredDominantAttribute, String hairColor) {
        super(name, gender, age, profession, dominantAttribute, preferredGender, preferredMaxAge, preferredProfession, preferredDominantAttribute);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
