package day16;

abstract class Item{
	public abstract int cost();
	}
abstract class Cream extends Item{
	
}
abstract class Ingredients extends Item{
	
}
class Venila extends Cream{
	Item item;
	public Venila() {
		// TODO Auto-generated constructor stub
	}
	public Venila(Item item) {
		this.item=item;
	}
	
	public int cost() {
		if(item==null)
			return 10;
		else 
			return 10+item.cost();
		}
}
class ButterScotch extends Cream{
	Item item;
	public ButterScotch() {
		// TODO Auto-generated constructor stub
	}
	public ButterScotch(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if(item==null)
			return 15;
		else
			return 15+item.cost();
		}
	}
class Nuts extends Ingredients{
	Item item;
	public Nuts() {
		// TODO Auto-generated constructor stub
	}
	public Nuts(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if(item==null)
			return 5;
		else
			return 5+item.cost();
	}
	
}
class DryFruites extends Ingredients{
	Item item;
	public DryFruites() {
		// TODO Auto-generated constructor stub
	}
	public DryFruites(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		if(item==null)
			return 10;
		else
			return 10+item.cost();
	}
	
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Item icecream=new Venila(new DryFruites(new ButterScotch(new Nuts())));
		System.out.println("One Venila-Butter Scotch Icecream with Nuts and Dryfruits Cost:"+icecream.cost());
	}
	

}
