import java.util.Arrays;
import java.util.List;

public class Source {
    public static void main(String[] args) {
        List<?> mixed =  Arrays.asList(9, 3, "7", "3");
        System.out.println(sum(mixed)==22);
    }
    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt((i)-> Integer.parseInt(i.toString())).sum();
    }

}
