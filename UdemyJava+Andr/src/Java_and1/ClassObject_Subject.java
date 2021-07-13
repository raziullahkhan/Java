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
public class ClassObject_Subject {
    private String subjectCode;
    private String subjectName;

    public ClassObject_Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }
    public ClassObject_Subject(ClassObject_Subject subject){
        this.subjectCode=subject.subjectCode;
        this.subjectName=subject.subjectName;
    }
    public boolean equals(ClassObject_Subject object){
        return (this.subjectName.equals(object.subjectName)&&this.subjectCode.equals(object.subjectCode));     
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String toString(){
        return "Subject information:\n"+
                "Subject code: "+subjectCode+"\n"+
                "Subject name: "+subjectName+"\n";
    }
    
}
