import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box<?>>{

    private List<T> contents;

    public Box() {
        this.contents = new ArrayList<>();
    }

    public List<T> getContents() {
        return contents;
    }

    public void load(T... fruits) {
        contents.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        return contents.get(0).weight * contents.size();
    }

    public void repack(Box<T> other) {
        contents.addAll(other.getContents());
        other.getContents().clear();
    }

    @Override
    public int compareTo(Box<?> o) {
        float thisSize = getWeight();
        float otherSize = o.getWeight();

        if (thisSize < otherSize) {
            return -1;
        } else if (thisSize > otherSize) {
            return 1;
        }
        return 0;
    }
}
