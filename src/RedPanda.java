//inheritance - more specific classes can inherit qualities of
// another class

//RedPanda is a child class / subclass of Animal
//Animal is the parent class / superclass of RedPanda
public class RedPanda extends Animal{

    private String color;

    public RedPanda(String c, int e) {

        //for child classes, the first line in the constructor
        //MUST be a call to the parent class constructor
        //using the "super" keyword
        super(e);

        //after calling the parent constructor, set instance vars
        color = c;
    }

    //a child class has access to all public methods
    // of its parent class

    //a child class can have its own defined methods
    public void paint(String newColor) {
        color = newColor;
        System.out.println("new color is " + color);
    }

    public void backflip() {
        //private variables from the parent class can't be
        //directly accessed
        //energy -= 2;

        //can call public parent class methods
        int newEnergy = getEnergy() - 2;
        setEnergy(newEnergy);
    }

    //overriding methods - redefine a parent class method
    //so that objects of this class will use this version of
    //the method
    public String toString() {
        return "Color: " + color + ", Energy: " + getEnergy();
    }

    //the String class has its own equals() method that overrides the Object equals()

    //two RedPandas are equal if both the energy and
    //color are the same
    public boolean equals(Object o) {
        if (o instanceof RedPanda) {
            RedPanda other = (RedPanda)o;
            if(this.getEnergy() == other.getEnergy() && this.color.equals(other.color)) {
                return true;
            }
        }
        return false;
    }
}
