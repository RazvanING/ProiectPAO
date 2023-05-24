package ro.unibuc.electronicpunchcard.model;

public class manager extends person{

    private String department;

    private String qualification;



    public manager(String firstName, String lastName, String badgeId, String department, String qualification) {
        super(firstName, lastName, badgeId);
        this.department = department;
        this.qualification = qualification;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("manager{");
        sb.append("department='").append(department).append('\'');
        sb.append(", qualification='").append(qualification).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
