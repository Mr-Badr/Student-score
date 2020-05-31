
package Java_Swing_Project;

/**
 *
 * @author Badr Eddine El-Harchali
 */
public class Student {
    private String Name;
    private float note1,note2,note3,moyenne;  // moyenne = Average

    public Student(String Name, float note1, float note2, float note3, float moyenne) {
        this.Name = Name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.moyenne = moyenne;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getNote1() {
        return note1;
    }

    public void setNote1(float note1) {
        this.note1 = note1;
    }

    public float getNote2() {
        return note2;
    }

    public void setNote2(float note2) {
        this.note2 = note2;
    }

    public float getNote3() {
        return note3;
    }

    public void setNote3(float note3) {
        this.note3 = note3;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    
    
}
