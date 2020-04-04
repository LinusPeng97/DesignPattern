package main.java.pers.linus.behavior.iterator;

import java.util.ArrayList;

/**
 * 适用：当想遍历一个聚合对象，但是又不想向外界表示其内部表示，或者有特殊的遍历方式
 */
public class Client {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
    }
}
