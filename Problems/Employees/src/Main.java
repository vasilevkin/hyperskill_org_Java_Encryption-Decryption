class Employee {
    protected String name;
    protected String email;
    protected int experience;
    // write fields

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    // write constructor

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
    // write getters
}

class Developer extends Employee {
    String mainLanguage;
    String[] skills;
    // write fields

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }
    // write constructor

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills.clone();
    }
    // write getters
}

class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;
    // write fields

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }
    // write constructor

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods.clone();
    }
    // write getters
}
