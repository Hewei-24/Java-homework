public class Employee20241576_2_1 {
    private String name;
    private double salary;

    // �޲ι��췽��
    public Employee20241576_2_1() {
        this.name = "";
        this.salary = 0.0;
    }

    // ���ι��췽��
    public Employee20241576_2_1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // ��ȡ����
    public String getName() {
        return name;
    }

    // ��������
    public void setName(String name) {
        this.name = name;
    }

    // ��ȡ����
    public double getSalary() {
        return salary;
    }

    // ���ù���
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // ��ĳ���ٷֱ����Ա���Ĺ���
    public void raiseSalary(double byPercent) {
        this.salary += this.salary * byPercent / 100;
    }
}