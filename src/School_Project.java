public class School_Project {

    public static void main(String[] args){
        Student student1 = new Student("Alexander", "van 't Hooft", 12345);
        Student student2 = new Student();
        Student student3 = new Student("Hank", "McCoy", 616);
        
        
        
        System.out.println(student1.name);
        student2.allInfoSentence();
        
    }
}

class Person{
    String name;

     Person(String name){
        this.name = name;
    }

    //Overloaded
    Person(){
        this.name = "!John Doe!";
    }
}

class Student{
    String name;
    String surname;
    int studentNumber;



    Student(String n, String s, int snum){
        this.name = n;
        this.surname = s;
        this.studentNumber = snum;
    }

    Student(){
        this.name = "John!";
        this.surname = "Doe!";
        this.studentNumber = 0;
    }

    public void allInfoSentence(){
        System.out.printf("%s %s has student number %d", name, surname, studentNumber);
    }
}

class Die{
    int sidesNum;

    Die(int nS){
        this.sidesNum = nS;
    }
}