package Interfaces.Nested;

public class B implements A.NestedIf{
    @Override
    public boolean isNotNegative(int x) {
        return x > 0;
    }

}
