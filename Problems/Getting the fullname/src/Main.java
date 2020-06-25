class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        String fullName = firstName == null ? "" : firstName + " ";
        fullName += lastName == null ? "" : lastName;

        return fullName.trim().equals("") ? "Unknown" : fullName.trim();
    }
}
