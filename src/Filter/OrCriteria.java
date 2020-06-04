package Filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaItems=criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems=otherCriteria.meetCriteria(persons);

        for (Person person:persons
             ) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }

        }


//在一个过滤过的组别中添加别的组的元素

        return firstCriteriaItems;
    }
}
