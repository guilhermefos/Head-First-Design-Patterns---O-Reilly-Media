
public class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void display(){ }
	
	// Control Behavior Methods
	public void performFly(){ flyBehavior.fly(); }
	public void performQuack(){ quackBehavior.quack(); }
	
	public void swim(){
		System.out.println("All ducks float, even decoys !");
	}
	
	public void setFlyBehavior(FlyBehavior newFlyBehavior){
		flyBehavior = newFlyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior newQuackBehavior){
		quackBehavior = newQuackBehavior;
	}

}
