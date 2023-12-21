package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> femalePerson = new ArrayList<>();
        for (Person penson : persons) {
            if (penson.getGender().equalsIgnoreCase("FEMALE")) {
                femalePerson.add(penson);
            }
        }
        return femalePerson;
    }
}
