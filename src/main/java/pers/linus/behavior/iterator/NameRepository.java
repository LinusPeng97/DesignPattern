package main.java.pers.linus.behavior.iterator;

public class NameRepository implements Aggregate{
    private String[] nameArray = {"彭泽新", "Star丿pzx", "雪停了你走了"};

    @Override
    public Iterator getIterator() {
        return new NameRepositoryIterator();
    }

    private class NameRepositoryIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < nameArray.length;
        }

        @Override
        public Object next() {
            return nameArray[index++];
        }
    }
}
