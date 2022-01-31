
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() { }
    
    public void performFly() {
        
    }
    
    public void performQuack() {
        
    }
    
    public abstract void display();
    
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}