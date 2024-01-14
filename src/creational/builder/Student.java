package creational.builder;

import java.util.Date;

public class Student {
    private String name;
    private int id;
    private Date dob;
    private int rollNumber;

    private Student(Builder builder){
        this.id = builder.id;
        this.dob = builder.dob;
        this.name = builder.name;
        this.rollNumber = builder.rollNumber;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString(){

        return this.id + " " + this.name + " " + this.rollNumber;
    }

    static class Builder{
        private String name;
        private int id;
        private Date dob;
        private int rollNumber;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDob(Date dob) {
            this.dob = dob;
            return this;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }


    }
}
