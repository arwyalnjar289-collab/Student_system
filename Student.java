public class Student {
    private String name;
    private int id;
    private String major;

    // Constructor لإنشاء طالب جديد
    public Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    // -------- Getters --------
    public String getName() { return name; }
    public int getId() { return id; }
    public String getMajor() { return major; }

    // -------- Setters --------
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setMajor(String major) { this.major = major; }

    // -------- Display --------
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Major: " + major);
    }
}
