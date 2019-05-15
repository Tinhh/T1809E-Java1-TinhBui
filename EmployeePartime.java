public class EmployeePartime extends salaryPolicy {
    public float rate = (float)(2.5);

//    EmployeePartime partime = new EmployeePartime();

    public float getSalary(){

        float tich = rate * baseSalary;
        return tich;
    }
}
