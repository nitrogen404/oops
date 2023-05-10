import java.util.ArrayList;
import java.util.List;

public class RecruitTeam {
    private List<Candidate> candidates;
    
    // Default constructor
    public RecruitTeam() {
        candidates = new ArrayList<>();
    }
    
    // Parameterized constructor
    public RecruitTeam(List<Candidate> candidates) {
        this.candidates = candidates;
    }
    
    // Method to evaluate candidates based on criteria, conduct interviews, and calculate final marks
    public void evaluateCandidates() {
        for (Candidate candidate : candidates) {
            if (candidate.isEligible()) {
                float finalMarks = candidate.getFinalMarks();
                // Perform further evaluation or processing as needed
                
                // Print the final marks for the candidate
                System.out.println(candidate.getName() + ": Final Marks - " + finalMarks);
            }
        }
    }
    
    // Getter and setter
    
    public List<Candidate> getCandidates() {
        return candidates;
    }
    
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
