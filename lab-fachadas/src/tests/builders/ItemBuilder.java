package builders;

import main.entities.Item;

public class ItemBuilder {

	private Item item;
	
	public static ItemBuilder mockItem() {
		ItemBuilder builder = new ItemBuilder();
		builder.item = new Item("ma��", 10);
		
		return builder;
	}
	
	public Item getItem() {
		return this.item;
	}
}
