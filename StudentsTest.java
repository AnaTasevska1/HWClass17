package HWClass17;

public class StudentsTest {
    public static void main(String[] args) {
        Students student=new Students( "Mila", 90, 80,70);
        Students student1 = new Students("Kiko", 75, 70, 70);
        Students student2 = new Students("Kiki", 85, 80, 75);
        Students student3 = new Students("Koki", 70, 85, 90);
        Students student4 = new Students("Niko", 95, 75, 85);

        System.out.println(student.name+"'s average grade is "+ student.averageGrade());
        System.out.println(student1.name+"'s average grade is "+ student.averageGrade());
        System.out.println(student2.name+"'s average grade is "+ student.averageGrade());
        System.out.println(student3.name+"'s average grade is "+ student.averageGrade());
        System.out.println(student4.name+"'s average grade is "+ student.averageGrade());
    }
}

