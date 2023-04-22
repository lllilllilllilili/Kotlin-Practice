import org.jetbrains.annotations.NotNull;
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    //빼지면 컴파일 단계에서 체크가 안됌.
    @NotNull
    public String getName() {
        return name;
    }
}
