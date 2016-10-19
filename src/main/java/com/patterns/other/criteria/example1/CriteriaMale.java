package main.java.com.patterns.other.criteria.example1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List meetCriteria(List<Person> persons) {
        List malePersons = new ArrayList();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}