
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());

		Dog dog = new Dog();
		print(dog.eat());
		print(dog.sleep());
		print(dog.barks());
		
		
		Fish fish = new Fish();
		print(fish.eat());
		print(fish.sleep());
		print(fish.swims());
		
		Monkey monkey = new Monkey();
		print(monkey.eat());
		print(monkey.sleep());
		print(monkey.jumps());
		
		Unicorn unicorn = new Unicorn();
		print(unicorn.eat());
		print(unicorn.sleep());
		print(unicorn.talks());
	}
	private static void print(String s){
		System.out.println(s);
	}
}
