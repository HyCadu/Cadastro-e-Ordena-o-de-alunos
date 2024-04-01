public class Student {

    // Características de um aluno
    public String name;
    public int age;

    public Student() {
        
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
