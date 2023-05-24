package ro.unibuc.electronicpunchcard.model;

public class employee extends person{

private String qualification;

private String department;


    public employee(String firstName, String lastName, String badgeId, String qualification, String department) {
        super(firstName, lastName, badgeId);
        this.qualification = qualification;
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("employee{");
        sb.append("qualification='").append(qualification).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getEmployeeID() {
        return 0;
    }
}
