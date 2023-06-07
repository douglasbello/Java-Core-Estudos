import java.util.Objects;

public class MyObject {
    String x;
    int z;

    public MyObject(String x, int z) {
        this.x = x;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return z == myObject.z && Objects.equals(x, myObject.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, z);
    }
}