package example3;

class StudentInfo {
    String className;
    String[] cols;
    Object[][] rows;

    public String toSting() {
        return className;
    }

    public StudentInfo(String className, String[] cols, Object[][] rows) {
        this.className = className;
        this.cols = cols;
        this.rows = rows;
    }
}
