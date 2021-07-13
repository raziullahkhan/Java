/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;


public class ClassObject_Student {
    private String studentName;
    private long studentNumber;

    public ClassObject_Student(String studentName, long studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    public ClassObject_Student(ClassObject_Student student){
        this.studentName=student.studentName;
        this.studentNumber=student.studentNumber;
    }
    public boolean equals(ClassObject_Student object){
        return (this.studentName.equals(object.studentName) && this.studentNumber==object.studentNumber);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String toString(){
        return "Student information:\n"+
                "Student name: "+studentName+"\n"+
                "Student number: "+studentNumber+"\n";
    }
}
