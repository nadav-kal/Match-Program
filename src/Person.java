public abstract class Person {

    private String name;
    private String gender;
    private int age;
    private String profession;
    private String dominantAttribute;
    private String preferredGender;
    private int preferredMaxAge;
    private String preferredProfession;
    private String preferredDominantAttribute;

    public Person(String name, String gender, int age, String profession, String dominantAttribute, String preferredGender, int preferredMaxAge, String preferredProfession, String preferredDominantAttribute) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
        this.dominantAttribute = dominantAttribute;
        this.preferredGender = preferredGender;
        this.preferredMaxAge = preferredMaxAge;
        this.preferredProfession = preferredProfession;
        this.preferredDominantAttribute = preferredDominantAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDominantAttribute() {
        return dominantAttribute;
    }

    public void setDominantAttribute(String dominantAttribute) {
        this.dominantAttribute = dominantAttribute;
    }

    public String getPreferredGender() {
        return preferredGender;
    }

    public void setPreferredGender(String preferredGender) {
        this.preferredGender = preferredGender;
    }

    public int getPreferredMaxAge() {
        return preferredMaxAge;
    }

    public void setPreferredMaxAge(int preferredMaxAge) {
        this.preferredMaxAge = preferredMaxAge;
    }

    public String getPreferredProfession() {
        return preferredProfession;
    }

    public void setPreferredProfession(String preferredProfession) {
        this.preferredProfession = preferredProfession;
    }

    public String getPreferredDominantAttribute() {
        return preferredDominantAttribute;
    }

    public void setPreferredDominantAttribute(String preferredDominantAttribute) {
        this.preferredDominantAttribute = preferredDominantAttribute;
    }
}
