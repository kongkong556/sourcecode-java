import java.util.Date;

class Order2 {
	private int id;
	double totalPrice;
	double discountPrice;
	double netPrice;
	private OrderItem[] items = new OrderItem[2];
	private int counter;
	private Date orderDate;
	
	public void addItem(OrderItem orderItem1) {
		// TODO Auto-generated method stub
		items[counter] = orderItem1;
	}

	public void calculateTotalPrice() {
		// TODO Auto-generated method stub
		for (OrderItem orderItem : items) {
			
			//totalPrice += orderItem.book.getPrice();
		}
	}
	
	
}

public class Order {
	public static void main(String[] args) {
		
		
		Book book1 = new Book("First book",8);
		Book book2 = new Book("Second book",8);
		
		OrderItem orderItem1 = new OrderItem(book1,1);
		OrderItem orderItem2 = new OrderItem(book2,1);
		
		Order2 order = new Order2();
		order.addItem(orderItem1);
		order.addItem(orderItem2);
		order.calculateTotalPrice();
		System.out.println(order.totalPrice);
		System.out.println(order.netPrice);
		System.out.println(order.discountPrice);
	}
}
