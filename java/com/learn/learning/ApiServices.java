package com.learn.learning;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LibrarySystem")
public class ApiServices {
	LibrarySystem librarySystem;
	
	@GetMapping("{Bookid}")
	public LibrarySystem getLibrarySystemDetails(String id) {
		return librarySystem;
				//new LibrarySystem("c1","book","varsha",121,2023);
		
	}
	
	public String createLibrarySystemDetails(@RequestBody LibrarySystem librarySystem) {
		this.librarySystem=librarySystem;
		
		return "book created";
	
	}
	@PutMapping
	public String updateLibrarySystemDetails(@RequestBody LibrarySystem librarySystem) {
		this.librarySystem=librarySystem;
		
		return "book updated";
	
	}
	@DeleteMapping
	public String deleteLibrarySystemDetails(String BookId) {
		this.librarySystem=null;
		
		return "book deleted by its ID";
	
	}
	
	

}
