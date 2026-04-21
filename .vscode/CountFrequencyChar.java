import java.util.HashMap;

public class CountFrequencyChar {
    
public static void main(String[] args) {
		String str = "aafdbmnassfg";
		HashMap<Character , Integer> map = new HashMap<>();
		//count frquency
		for(char ch : str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		//System.out.println(map);
		for(char ch : str.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println(ch);
				return;
			}
		
		}
		
	}
}
