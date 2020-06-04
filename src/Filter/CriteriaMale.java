package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons=new ArrayList<Person>();
        for (Person person:persons
             ) {
//            两个string类型的变量进行对比，看是否相等的功能，但是在对比是否相等的需求下，我们常用的还是equals()方法，
//            相比equals而言，equalsIgnoreCase()有其自己的功能，可以忽略大小写，只要两个类型字母组成一样，那么就可以核对成功。
            if (person.getGender().equalsIgnoreCase("MALE")){
                      malePersons.add(person);
            }
        }
        return  malePersons;


    }
}
