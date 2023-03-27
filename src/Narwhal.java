public class Narwhal extends Animal{

    private boolean pointy;

    public Narwhal() {
        super(10);
        pointy = true;
    }

    public Narwhal(boolean p) {
        //if there's a no-param constructor
        //OR the default constructor in the parent
        //class, that will get automatically called
        //if you don't use super()
        pointy = p;
    }

    public void skewer() {
        pointy = false;
        System.out.println("skewer");
    }

    //override eat() from Animal -method signature
    //(return type, name, params) need to match
    public void eat()  {
        //use the set and get methods because
        //energy is private
        setEnergy( getEnergy() + 100);
        System.out.println("Narwhal nom nom");
    }

    public String toString() {
        //to specifically call the parent class version
        //of an overridden method, use the "super" keyword
        return super.toString() + ", pointy: " + pointy;
    }

    public boolean equals(Object o) {
        if (o instanceof Narwhal) {
            Narwhal other = (Narwhal)o;

            //can call super.equals() to check energy
            //-this would be useful if the parent class had multiple
            //instance variables to check equality
            if (super.equals(other) && this.pointy == other.pointy) {
                return true;
            }
        }
        return false;
    }
}
