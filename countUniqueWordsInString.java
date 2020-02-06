import java.util.*;

public class countUniqueWordsInString {

	public static void main(String[] args) {
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		String str = "I Love jAva Programming";
		char []ch= str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		
		System.out.println(map);
		Set<Character> uni= new HashSet<Character>();
		Set <Character> set= map.keySet();
		for(char chr: set) {
			if(map.get(chr)==1) {
				uni.add(chr);
			}
			
			
		}
		System.out.println(uni);
	}
}
