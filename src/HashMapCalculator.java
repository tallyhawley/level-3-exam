import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> hm1, HashMap<String, String> hm2) {
		int amtEqual = 0;
		for(String s : hm1.keySet()) {
			if(hm2.containsKey(s) && hm1.get(s).equals(hm2.get(s))) {
				amtEqual++;
			}
		}
		return amtEqual;
	}
}
