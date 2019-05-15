public class EmployeeFullTime extends salaryPolicy {

    public float rate = (float)4;
//
//    public EmployeeFullTime(float baseSalary) {
//        super(baseSalary);
//    }
//    EmployeeFullTime fulltime = new EmployeeFullTime();
    @Override
    public float getSalary(){
        float tich = rate * baseSalary;
        return tich;
    }


}
