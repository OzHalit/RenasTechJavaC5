package day28_OOP_Encapsulation;

public class encapsulation_object {

    public static void main(String[] args) {
        EncapsulationIntro obj1=new EncapsulationIntro();

        obj1.setName("Hello");
        System.out.println(obj1.getName());
        obj1.setIdnum(126458);
        System.out.println(obj1.getIdnum());
        obj1.setAge(34);
        System.out.println(obj1.getAge());


    }
}
