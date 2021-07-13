package Worker;
public class Worker {
    private int hw;
    private double payRate;
    public void setData(int a,double b){
        hw=a;
        payRate=b;
    }
    public double calculateSalary(){
        double salary;
        if(hw<40)
            salary=hw*payRate;
        else
            salary=hw*(2*payRate);
        return salary;
    }
}
