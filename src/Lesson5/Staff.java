package Lesson5;

public class Staff {
    public static void main(String[] args) {

    }

    private String name;
    private int age;
    private String post;
    private String phone;
    private String email;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public Staff (String name, int age, String post, String phone, String email, int salary){
        this.name = name;
        this.age = age;
        this.post = post;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
    }

    public void print(){
        System.out.println(name + " " + age + " " + post + " " + phone + " " + email + " " + salary);
    }
}
