package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Controller
public class PersonController {

		private final PersonRepository repository;
		
		public PersonController(PersonRepository repository) {
			this.repository = repository;
		}
		
		@GetMapping("/")
		
		// もし、「getAllPeople」に変更したらエラー発生する？」
		public String getAllPersons(@ModelAttribute Person person, Model model) {
			
			
			model.addAttribute("persons", repository.findAll());
			return "list";
		}
}
