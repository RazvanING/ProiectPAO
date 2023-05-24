package ro.unibuc.electronicpunchcard.model;

public class departament {

    public String departamentId;

    public String departamentName;

    public departament(String departamentId, String departamentName) {
        this.departamentId = departamentId;
        this.departamentName = departamentName;
    }

    public String getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(String departamentId) {
        this.departamentId = departamentId;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("departament{");
        sb.append("departamentId='").append(departamentId).append('\'');
        sb.append(", departamentName='").append(departamentName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
