public class Polymorphism {
    public static void main(String [] args) {
        Narwhal n = new Narwhal();
        n.eat();
        System.out.println(n);


        //polymorphism - an object can be declared as any type within its
        //hierarchy
        //-method behaviors will follow the method definitions defined
        //closest to the actual type
        //declared type - type that's declared on the left of =
        //actual type - constructor type on the right of =
        Animal a = new Narwhal();
        Object o = new Narwhal();


        n.eat();

        //the Narwhal version of eat() runs because
        //Narwhal is the closest type to the actual type
        a.eat();

        //from a client class, you can't access a parent class version
        //of an overridden method
        //a.super.eat();

        //eat() was not defined in Object, so it can't
        //be directly called from o
        //o.eat();

        //to call eat() from o -
        // cast o as an Animal or a Narwhal first
        Animal a2 = (Animal)o;
        a2.eat();

//        a2.skewer()
        n.skewer();

        Animal a3 = new Animal();

        //class cast exception bc a3 was never a narwhal
//        Narwhal n2 = (Narwhal)a3;

        //this will prevent the program from crashing
        //because a3 is NOT a Narwhal, so the if statement will be false
        //and won't run the code to cast
        if (a3 instanceof Narwhal) {
            Narwhal n2 = (Narwhal)a3;
        }

        //convenient usage of polymorphism - declare an array or
        //arraylist of a parent type, then store objects of the
        //parent type and any child class objects
        Animal [] animals = new Animal[3];
        animals[0] = a;
        animals[1] = n;
        animals[2] = new RedPanda("green", 50);

        System.out.println();
        System.out.println();

        //indices0 and 1 both have actual types of Narwhal
        // so Narwhal's eat() will run
        //index 2 has an actual type of RedPanda,
        //-since RedPanda never overrode eat(), Animal eat() runs

        for (Animal an: animals) {
            an.eat();

            //call skewer() from the objects that are Narwhals
            if (an instanceof Narwhal) {
                Narwhal x = (Narwhal)an;
                x.skewer();
            }
        }



    }

}
