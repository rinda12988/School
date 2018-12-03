public class Student{
    private String name;
    int mark;
    Student(String nm){
        name =nm;
    }
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setMark(int m){
        mark = m;
    }

    public int getMark(){
        return mark;
    }

    public String toString(){
        return "Name: " + name + "Mark" + mark;
    }
}