public class HR extends RecruitTeam {
    
    // Default constructor
    public HR() {
        super();
    }
    
    // Parameterized constructor
    public HR(List<Candidate> candidates) {
        super(candidates);
    }
    
    // Method to inform candidates about their selection status
    public void informCandidates() {
        for (Candidate candidate : getCandidates()) {
            if (candidate.isEligible()) {
                System.out.println("Congratulations, " + candidate.getName() + "! You have been selected.");
            } else {
                System.out.println("Sorry, " + candidate.getName() + ". You have not been selected.");
            }
        }
    }
}
