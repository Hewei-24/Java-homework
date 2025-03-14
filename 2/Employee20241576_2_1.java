public class Employee20241576_2_1 {
    private String name;
    private double salary;

    // 无参构造方法
    public Employee20241576_2_1() {
        this.name = "";
        this.salary = 0.0;
    }

    // 带参构造方法
    public Employee20241576_2_1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 获取名字
    public String getName() {
        return name;
    }

    // 设置名字
    public void setName(String name) {
        this.name = name;
    }

    // 获取工资
    public double getSalary() {
        return salary;
    }

    // 设置工资
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 按某个百分比提高员工的工资
    public void raiseSalary(double byPercent) {
        this.salary += this.salary * byPercent / 100;
    }
}