/**
 * SaifErDhon
 */

class Animal{
    public String name;
    public int age;
    public int DhonSize;
    Animal(String name, int age, int DhonSize){
        this.name = name;
        this.age = age;
        this.DhonSize = DhonSize;
    }
}


class Human extends Animal{
    Human(String name, int age, int DhonSize){
        super(name,age,DhonSize);
    }
    @Override
    public String toString(){
        return "Name: "+super.name+" Age: "+super.age+" Dhon Size: "+ super.DhonSize;
    }
}

class Gorilla extends Animal{
    Gorilla(String name, int age, int DhonSize){
        super(name,age,DhonSize);
    }
    @Override
    public String toString(){
        return "Name: "+super.name+" Age: "+super.age+" Dhon Size: "+ super.DhonSize;
    }
}

 public class SaifErDhon {
    public static void main(String[] args) {
        // Animal Saif = new Human("Saif",22,0);
        // Animal Zobaer = new Gorilla("Zobaer",23,8);
        // System.out.println(Saif);
        // System.out.println(Zobaer);

        int mtx[][] = {{3,2,5,2},
                        {26,26,43,1},
                        {3,2,5,2},
                        {26,26,43,1}};
        Matrix m = new Matrix(mtx);
        m.Transpose();
        System.out.println(m);

    }
}