import java.util.Arrays;
import java.util.List;

public class Stream1{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30,40,50,90,50,40,30,20,50);
        //list.stream().forEach(System.out::println);
        //list.stream().forEach(n->System.out.println(n));
        // for (Integer n : list) {
        //     System.out.println(n);
            
        // }
  //list.stream().filter(n-> n%2==0).forEach(System.out::println);

//list.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));
//list.stream().map(n->n*n).forEach(n->System.out.println(n));
 //list.stream().distinct().forEach(n ->System.out.println(n));


 List<String> str = Arrays.asList("amitha","kumar" ,"pooja","komal","kavita");
 str.stream().filter(n-> n.startsWith("k")).forEach(n->System.out.println(n));
 str.stream().filter(n-> n.endsWith("a")).forEach(n->System.out.println(n));
     }
}