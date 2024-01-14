package creational.builder;

import java.util.Date;

 class Builder1 {
    private String name;
    private int id;
    private Date dob;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public Builder1 setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Builder1 setId(int id) {
        this.id = id;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public Builder1 setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Builder1 setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }



}
