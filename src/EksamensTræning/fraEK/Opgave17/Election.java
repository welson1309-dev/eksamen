package EksamensTræning.fraEK.Opgave17;

import java.util.ArrayList;
import java.util.List;

public class Election {
   private List<Candidate> candidates= new ArrayList<>();

   public void addCandidate(Candidate candidate){
       candidates.add(candidate);
   }


    public int getTotalVotes(){
        int sum =0;
        for (Candidate candidate: candidates){
            sum+=candidate.getNumberOfVotes()+sum;
        }
        return sum;
    }


    public List getCandidatesFromParty(String searchParty){
        List<Candidate> sameParty= new ArrayList<>();

        for (Candidate candidate: candidates){
            if (searchParty.equalsIgnoreCase(candidate.getParty())){
                sameParty.add(candidate);
            }
        }return sameParty;
    }
}
