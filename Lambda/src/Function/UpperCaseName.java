package Function;

import java.util.function.Function;

public class UpperCaseName implements Function<AnyClass,String> {

    @Override
    public String apply(AnyClass anyClass) {
        return anyClass.getName().toUpperCase();
    }
}
