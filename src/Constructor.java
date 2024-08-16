import org.w3c.dom.ls.LSOutput;

public class Constructor {

    public static void main(String[] args) {
        Student divyansh = new Student();
        divyansh.nameChange("Div");
        divyansh.greeting();

    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " + name);
    }

    void nameChange(String newName){
        name=newName;

    }

    Student() {
        this.rno=13;
        this.name="Divyansh Sharma";
        this.marks=87.4f;
    }

}

