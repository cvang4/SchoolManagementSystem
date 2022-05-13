package SchoolManagementSystem;

/**
 * This class is responsible for keeping the
 * track of students fees, names, grade, fees
 * paid.
*/
public class Student {
    
    private int id;
    private String name; 
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Creates new student object by intializing.
     * Fees for every student is $30,000 per year.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */ 
    public Student (int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name and student's id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade (int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * 
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @param feesPaid the feesPaid to set
     */
    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @param feesTotal the feesTotal to set
     */
    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    /**
     * 
     * @return the remaining fees.
     */
    public int getRemainigFees() {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString () {
        return "Student's name: " + name + "Total fees paid so far $" + feesPaid;
    }

}
