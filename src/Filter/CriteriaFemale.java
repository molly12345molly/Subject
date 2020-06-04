package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
//    Gender性别
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> famalePersons=new ArrayList<Person>();

        for (Person person:persons
             ) {

            if(person.getGender().equalsIgnoreCase("Female")){
                famalePersons.add(person);
            }
        }



        return famalePersons;
    }
}
