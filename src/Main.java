import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();
        File file = new File(path + "/src/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<Person> hetroManList = new ArrayList<>();
        List<Person> hetroWomanList = new ArrayList<>();
        List<Person> homoManList = new ArrayList<>();
        List<Person> homoWomanList = new ArrayList<>();
        List<Couple> couplesList = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] person = line.split(",");
            if(person[Categories.Gender].equals("Male") &&
            person[Categories.PreferredGender].equals("Female")) {
                Person p = manInstance(person);
                hetroManList.add(p);
            }
            else if(person[Categories.Gender].equals("Female") &&
                    person[Categories.PreferredGender].equals("Male")) {
                Person p = womanInstance(person);
                hetroWomanList.add(p);
            }
            else if(person[Categories.Gender].equals("Male") &&
                    person[Categories.PreferredGender].equals("Male")) {
                Person p = manInstance(person);
                homoManList.add(p);
            }
            else { // Gender Female PreferredGender Female
                Person p = womanInstance(person);
                homoWomanList.add(p);
            }
        }

        rateMatches(hetroManList, hetroWomanList, couplesList);
        rateMatches(homoManList, homoManList, couplesList);
        rateMatches(homoWomanList, homoWomanList, couplesList);
        couplesList.sort((firstCouple, secondCouple) -> secondCouple.getRate() - firstCouple.getRate());
        for(Couple couple: couplesList) {
            couple.printCoupleAndRate();
        }
    }



    public static void rateMatches(List<Person> firstPersonsList, List<Person> secondPersonsList,
                                          List<Couple> couplesList) {

        for(Person firstPerson: firstPersonsList)  {
            secondPersonsList.remove(firstPerson); // for prevent duplicates
            for(Person secondPerson: secondPersonsList) {
                Couple couple = new Couple(firstPerson, secondPerson, 0);
                int rate = 0;
                if(firstPerson.getPreferredMaxAge() >= secondPerson.getAge()) {
                    rate++;
                }
                if(secondPerson.getPreferredMaxAge() >= firstPerson.getAge()) {
                    rate++;
                }
                if(firstPerson.getPreferredDominantAttribute().equals(secondPerson.getDominantAttribute())) {
                    rate++;
                }
                if(secondPerson.getPreferredDominantAttribute().equals(firstPerson.getDominantAttribute())) {
                    rate++;
                }
                if(firstPerson.getPreferredProfession().equals(secondPerson.getProfession())) {
                    rate++;
                }
                if(secondPerson.getPreferredProfession().equals(firstPerson.getProfession())) {
                    rate++;
                }
                couple.setRate(rate);
                couplesList.add(couple);
            }
        }
    }

    public static Man manInstance(String[] person) {
        return new Man(
                person[Categories.Name],
                person[Categories.Gender],
                Integer.parseInt(person[Categories.Age]),
                person[Categories.Profession],
                person[Categories.DominantAttribute],
                person[Categories.PreferredGender],
                Integer.parseInt(person[Categories.PreferredMaxAge]),
                person[Categories.PreferredProfession],
                person[Categories.PreferredDominantAttribute],
                Integer.parseInt(person[Categories.HeightOrHairColor])
        );
    }

    public static Woman womanInstance(String[] person) {
        return new Woman(
                person[Categories.Name],
                person[Categories.Gender],
                Integer.parseInt(person[Categories.Age]),
                person[Categories.Profession],
                person[Categories.DominantAttribute],
                person[Categories.PreferredGender],
                Integer.parseInt(person[Categories.PreferredMaxAge]),
                person[Categories.PreferredProfession],
                person[Categories.PreferredDominantAttribute],
                person[Categories.HeightOrHairColor]
        );
    }


}