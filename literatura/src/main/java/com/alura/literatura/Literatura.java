package com.alura.literatura;

import com.alura.literatura.Main.Main;
import com.alura.literatura.Repository.IAuthorRepository;
import com.alura.literatura.Repository.IBookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Literatura implements CommandLineRunner {
	@Autowired
	private IBookRepository bookRepository;
	@Autowired
	private IAuthorRepository authorRepository;
	public static void main(String[] args) {
		SpringApplication.run(Literatura.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main( bookRepository, authorRepository);
		main.displayMenu();
	}
}