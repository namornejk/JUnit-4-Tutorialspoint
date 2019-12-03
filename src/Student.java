public class Student {
    private int id;
    private String name;
    private float percentage;
    private String grade;

    public Student(int id, String name, float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public String calculateGrade(){
        if(this.percentage < 35){
            this.grade = "fail";
        } else if(this.percentage < 50){
            this.grade = "C";
        } else if(this.percentage < 60){
            this.grade = "B";
        } else {
            this.grade = "A";
        }

        return this.grade;
    }
}
