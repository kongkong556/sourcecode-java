
public class Book {
	
	
		//Properties
		private String name;
		private double price;
		public Book(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public Book() {
			
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			
		}

		public void setName(String name) {
			
		}


//		public void setName(String name) {
//		}
//
//		public double getPrice() {
//			return price;
//		}
//
//		
//		public void setPrice(double price) {
//		}
	

}

class BookBuilder{
	private Book book = new Book();

	public BookBuilder setName(String name) {
		// TODO Auto-generated method stub
		book.setName(name);
		return this;
	}

	public BookBuilder setPrice(int price) {
		// TODO Auto-generated method stub
		book.setPrice(price);
		return this;
	}
	
	public Book build() {
		// TODO Auto-generated method stub
		return book;
	}
	
}

class BookStore {
	public static void main(String[] args) {
		Book book = new BookBuilder().setName("First book").setPrice(8).build();
	}
}
