package oops.inheritence;

class Animal{
    public void walk(){
        System.out.println("Animal is walking");
    }

}


 class Dog extends Animal{
    public void bark(){
        System.out.println("barking......"
            
        );
    }
    
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.walk();
    }
}
