package HWClass17;
/*
 Write a java Class Students that have a constructor which takes students name and 3 subject grades.
 Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
 */
public class Students {
    String name;
    int mathGrade;
    int algorithmsGrade;
    int calculusGrade;

    public Students(String name, int mathGrade, int algorithmsGrade, int calculusGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.algorithmsGrade = algorithmsGrade;
        this.calculusGrade = calculusGrade;
    }
        public int averageGrade(){
            return (mathGrade + algorithmsGrade + calculusGrade)/3;
        }
}
