package Library;

import java.util.*;

public class Service {
	Map<String, Book> library = new HashMap<>();

	public void addBook(Book book) {
		library.put(book.getName(), book);
	};

	public void removeBook(Book book) {
		library.remove(book.getName());
	}

	public String list() {
		Set<String> s = library.keySet();
		String bravo = "===============================LIBRARY===================================";
		for (String i : s) {
			String name = library.get(i).getName();
			String author = library.get(i).getAuthor();
			String genre = library.get(i).getGenre();
			String finale = "\n Book Name: " + name + "  Author: " + author
					+ "  Genre: " + genre;
			bravo += finale;
		}
		return bravo+"\n";
	}
}
