package Library;

public class Main {

	public static void main(String[] args) {
Service s = new Service();
Book Game = new Book ("Game of Thrones", "Action", "George R. R. Martin");
s.addBook(Game);
Book LOL = new Book ("LOL", "Comedy", "Saron");
s.addBook(LOL);
Book OCA = new Book ("Java", "Educational", "Oracle");
s.addBook(OCA);
System.out.println(s.list());
s.removeBook(OCA);
System.out.println(s.list());






	}

}
