package Function;

import java.util.Comparator;

public class MyComparator implements Comparator<AnyClass> {

    @Override
    public int compare(AnyClass o1, AnyClass o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
