package managerStudent.model;

import com.sun.tools.javac.Main;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {

    }
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (this.score >= 8.0) {
            return "Giỏi";
        }else if (this.score >= 6.5 && this.score < 8.0) {
            return "Khá";
        }else if (this.score < 6.5) {
            return "Trung bình";
        }
        return "";
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", score=" + score + "rank=" + getRank() + "]";
    }
}
