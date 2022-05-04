package day28_OOP_Encapsulation;

public class EncapsulationIntro {

    private String name;
    private long idnum;
    private int age;
    //nobody will have direct access to above variables

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setIdnum(long idNum){
        this.idnum=idNum;

    }
    public long getIdnum(){
        return idnum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
