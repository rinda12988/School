public class MscStudent2 extends Student implements LifeStyle{
    private String supervisor;
    MscStudent2(String nm){
        super(nm);
    }

    public void haveGoodFood(){
        System.out.println("Lots of bread, meat and veg");
    }
    public void haveAccommodation(){
        System.out.println("have a single room in a shared house");
    }

    public static void main(String[] args){
        MscStudent2 m1 = new MscStudent2("Mike");
        m1.haveGoodFood();

        MscStudent2 m2 = new MscStudent2("Mike");
        m2.haveAccommodation();
    }
}