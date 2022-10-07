package model;

import java.io.Serializable;

/**
 *
 * @author DungSobin
 */
public class Answer implements Serializable {

    static final long serialVersionUID = 1L;
    private Student student;

    public Answer() {
    }

    public Answer(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
}
