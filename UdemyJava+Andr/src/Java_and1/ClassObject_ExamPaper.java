/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

/**
 *
 * @author HP
 */
public class ClassObject_ExamPaper {
    private ClassObject_Student student;
    private ClassObject_Subject subject;
    private int marks;

    public ClassObject_ExamPaper(ClassObject_Student student, ClassObject_Subject subject, int marks) {
        this.student = new ClassObject_Student(student);
        this.subject = new ClassObject_Subject(subject);
        this.marks = marks;
    }

    public ClassObject_Student getStudent() {
        return new ClassObject_Student(student);
    }

    public void setStudent(ClassObject_Student student) {
        this.student = new ClassObject_Student(student);
    }

    public ClassObject_Subject getSubject() {
        return new ClassObject_Subject(subject);
    }

    public void setSubject(ClassObject_Subject subject) {
        this.subject = new ClassObject_Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String toString(){
        return "Exam Paper information:\n"+
                student+subject+"\n"+
                "Marks: "+marks;
    }
}
