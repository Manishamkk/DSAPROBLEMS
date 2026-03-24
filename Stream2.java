import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(10,30,40,50,30,20,120);
     int max = list.stream().max(Integer::compare).get();
      int min = list.stream().min(Integer::compare).get();

    }
}
