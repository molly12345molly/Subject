package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
//创建一个meal类，带有上面定义的item对象
public class Meal {
    private List<Item> items=new ArrayList<Item>();

    public void  addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost=0.0f;
        for (Item item:items
             ) {
            cost+=item.price();

        }
        return  cost;
    }

    public void showItems(){
        for (Item item: items
             ) {
            System.out.println(item.name());
            System.out.println(item.packing());
            System.out.println(item.price());

        }
    }


}
