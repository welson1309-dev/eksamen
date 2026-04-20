package EksamensTræning.fraEK.Opgave17;


public class Candidate {
    private String name, party;
    private int numberOfVotes;


    public Candidate(String name, String party, int numberOfVotes){
        this.name=name;
        this.numberOfVotes=numberOfVotes;
        this.party=party;
    }


    public int getNumberOfVotes() {
        return numberOfVotes;
    }
    public String getParty(){
        return party;
    }
}
