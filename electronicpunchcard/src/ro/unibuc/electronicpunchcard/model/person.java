package ro.unibuc.electronicpunchcard.model;

public class person {

    private String firstName;

    private String lastName;

    private String badgeId;

    public person(String firstName, String lastName, String badgeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.badgeId = badgeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", badgeId='").append(badgeId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
