
package Java_and1;


public class ClassObject_Driver {
    public static void main(String[] args) {
        ClassObject_Subject subject1=new ClassObject_Subject("TPG10AB","Technical Programming 1");
        ClassObject_Student student1=new ClassObject_Student("Chuck Norris",123810928);
        ClassObject_ExamPaper paper=new ClassObject_ExamPaper(student1,subject1,100);
        System.out.println("Subject Code: "+paper.getSubject().getSubjectCode());
        System.out.println("Student Number: "+paper.getStudent().getStudentNumber());
        System.out.println();
        System.out.println(paper);
}
