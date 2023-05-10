import java.util.Date;

public class Candidate {
    private String name;
    private Date dateOfBirth;
    private float hscMarks;
    private float pcMarks;
    private float ugMarks;
    private float pgMarks;
    private int projectCount;
    private boolean fullTimeStudy;
    private float interviewMarks;
    private String citizenship;
    
    // Default constructor
    public Candidate() {
    }
    
    // Parameterized constructor
    public Candidate(String name, Date dateOfBirth, float hscMarks, float pcMarks,
                     float ugMarks, float pgMarks, int projectCount, boolean fullTimeStudy,
                     float interviewMarks, String citizenship) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hscMarks = hscMarks;
        this.pcMarks = pcMarks;
        this.ugMarks = ugMarks;
        this.pgMarks = pgMarks;
        this.projectCount = projectCount;
        this.fullTimeStudy = fullTimeStudy;
        this.interviewMarks = interviewMarks;
        this.citizenship = citizenship;
    }
    
    // Getters and setters
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public float getHscMarks() {
        return hscMarks;
    }
    
    public void setHscMarks(float hscMarks) {
        this.hscMarks = hscMarks;
    }
    
    public float getPcMarks() {
        return pcMarks;
    }
    
    public void setPcMarks(float pcMarks) {
        this.pcMarks = pcMarks;
    }
    
    public float getUgMarks() {
        return ugMarks;
    }
    
    public void setUgMarks(float ugMarks) {
        this.ugMarks = ugMarks;
    }
    
    public float getPgMarks() {
        return pgMarks;
    }
    
    public void setPgMarks(float pgMarks) {
        this.pgMarks = pgMarks;
    }
    
    public int getProjectCount() {
        return projectCount;
    }
    
    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }
    
    public boolean isFullTimeStudy() {
        return fullTimeStudy;
    }
    
    public void setFullTimeStudy(boolean fullTimeStudy) {
        this.fullTimeStudy = fullTimeStudy;
    }
    
    public float getInterviewMarks() {
        return interviewMarks;
    }
    
    public void setInterviewMarks(float interviewMarks) {
        this.interviewMarks = interviewMarks;
    }
    
    public String getCitizenship() {
        return citizenship;
    }
    
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    
    // Method to check eligibility based on given criteria
    public boolean isEligible() {
        // Check date of birth
        Calendar cutoffDate = Calendar.getInstance();
        cutoffDate.set(1999, Calendar.JULY, 1);
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        if (dob.after(cutoffDate)) {
            return false;
        }
        
        // Check HSC aggregate marks
        if (hscMarks < 60.0f) {
            return false;
        }
        
        // Check average PCM/PCB marks for SC and ST candidates
        if ((citizenship.equals("SC") || citizenship.equals("ST")) && pcMarks < 50.0f) {
            return false;
        }
        
        // Check UG and PG CGPA
        if (ugMarks < 8.0f || pgMarks < 8.0f) {
            return false;
        }
        
        // Check minimum project count
        if (projectCount < 2) {
            return false;
        }
        
        // Check full-time study
        if (!fullTimeStudy) {
            return false;
        }
        
        // Check interview marks
        if (interviewMarks < 35.0f) {
            return false;
        }
        
        // Check citizenship
        if (!citizenship.equals("India")) {
            return false;
        }
        
        // All eligibility criteria met
        return true;
    }
    
    // Method to calculate final marks based on the evaluation process
    public float getFinalMarks() {
        // Add your final marks calculation logic here
        return 0.0f;
    }
}
