
public class Ques3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		
		Cat cat = new Cat();
		cat.eat();
		cat.meow();

	}
}

class Animal
{
	public void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking...");
	}
}
 
class Cat extends Animal
{
	public void meow()
	{
		System.out.println("meowing...");
	}
}