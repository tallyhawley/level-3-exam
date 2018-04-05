import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int francis = 0;
		int snowden = 0;
		for(String s : votes) {
			if(s.equalsIgnoreCase("pope francis")) {
				francis++;
			}
			else if(s.equalsIgnoreCase("edward snowden")) {
				snowden++;
			}
		}
		if(francis>snowden) {
			return "pope francis";
		}else if(snowden>francis) {
			return "edward snowden";
		}
		return "TIE";
	}
}
