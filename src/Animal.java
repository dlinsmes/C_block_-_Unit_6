public class Animal {

    private int energy;
    public Animal (int e) {
        energy = e;
    }
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int e) {
        energy = e;
    }

    public void eat() {
        energy += 5;
    }

    public void sleep() {
        energy += 10;
    }

    //toString() is a method originally defined in the
    //java Object class
    //-every class written is a subclass of Object

    public String toString() {
        return "Energy: " + energy;
    }

    //override equals() so that two objects are
    //the same when they're both Animal objects
    //and the energy values are the same
    public boolean equals(Object o) {
        //check if o is an Animal object
        if (o instanceof Animal) {
            //cast o to an Animal object so that Animal methods/vars
            //can be accessed
            Animal a = (Animal)o;
            //check if energy values are the same
            if (a.getEnergy() == this.energy) {
                return true;
            }
        }
        //return false if o isn't an Animal or if the energy isn't the same
        return false;
    }
}
