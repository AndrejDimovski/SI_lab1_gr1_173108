public class Course {
    List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public void removeStudent(Integer id){
        this.students.remove(id);
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}