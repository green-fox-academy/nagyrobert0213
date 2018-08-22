public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane Doe", 30, "female");
        person.introduce();
        person.getGoal();
        Student student = new Student("Jane Doe",30,"female", "The School of Life");
        student.skipDays(0);
        Mentor mentor = new Mentor("Jane Doe", 30, "female", "intermediate");
        Sponsor sponsor = new Sponsor("Jane Doe", 30, "female", "Google", 0);
    }
}
