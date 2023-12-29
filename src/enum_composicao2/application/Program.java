package enum_composicao2.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import enum_composicao2.entities.Comment;
import enum_composicao2.entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
	//Post1
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", dtf);
		String title = "raveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;
		
		Post p1 = new Post(moment, title, content, likes);
		
		//Comments
		
		p1.addComment(new Comment("Have a nice trip"));
		p1.addComment(new Comment("Wow that's awesome!"));
		
	//Post2
		LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", dtf);
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		
		Post p2 = new Post(moment2, title2, content2, likes2);
		
		//Comments
		
		p2.addComment(new Comment("Good night"));
		p2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		
	}

}
