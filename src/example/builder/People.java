package example.builder;

import java.util.Date;

public class People {

    private String name;
    private Boolean gender;
    private Date dob;
    private String govermentId;

    public static class Builder {
        private People instance = new People();

        public People get() {
            return this.instance;
        }

        public Builder setName(String name) {
            this.instance.setName(name);
            return this;
        }

        public Builder setGender(Boolean gender) {
            this.instance.setGender(gender);
            return this;
        }

        public Builder setDateOfBirth(Date dob) {
            this.instance.setDob(dob);
            return this;
        }

        public Builder setGovermentId(String govermentId) {
            this.instance.setGovermentId(govermentId);
            return this;
        }
    }

    /**
     * @return the name
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
     * @return the gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the govermentId
     */
    public String getGovermentId() {
        return govermentId;
    }

    /**
     * @param govermentId the govermentId to set
     */
    public void setGovermentId(String govermentId) {
        this.govermentId = govermentId;
    }

}
