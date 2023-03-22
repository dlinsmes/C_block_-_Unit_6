public class AnimalClient {
    public static void main(String [] args) {
        Animal a = new Animal(50);
        a.eat();
        a.sleep();
        System.out.println("a: " + a);

        RedPanda p = new RedPanda("blue", 20);
        p.backflip();
        p.sleep();
        //this will print the overridden version of toString
        //that's defined in RedPanda
        System.out.println("p: " + p);

        Animal a2 = new Animal(50);
        a2.eat();
        a2.sleep();

        //a and a2 are two different objects with the same value for energy
        //-overrode equals in Animal to check the energy values
        System.out.println("a is equal to a2: " + a.equals(a2));

        //the Object equals() checks if the two objects are the same in memory
        Animal a3 = a;
        System.out.println("a is equal to a3: " + a.equals(a3));

        //since the param for equals() is an object, then any
        //kind of object can be passed to the method call
        String s = "something";
        System.out.println("a is equal to s: " + a.equals(s));


        RedPanda p2 = new RedPanda("blue", 28);
        System.out.println("p is equal to p2: " + p.equals(p2));

        Animal a4 = new Animal(28);

        //these return different results depending on the
        //type of object that equals() is called from

        //calls equals() from Animal and checks energy
        System.out.println("a4 is equal to p: " + a4.equals(p));

        //calls equals() from RedPanda and catches that a4 is NOT
        //a RedPanda
        System.out.println("p is equal to a4: " + p.equals(a4));



    }
}
