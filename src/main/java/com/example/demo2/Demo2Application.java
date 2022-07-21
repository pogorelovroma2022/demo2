package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
	public static void main(String[] args) {
//		ConfigurableApplicationContext context =
				SpringApplication.run(Demo2Application.class, args);

//		CityRepository repository = context.getBean(CityRepository.class);

//		System.out.println(repository.findByName("Minsk"));
		// READ all
//		List<City> cities = repository.findAll();
//		System.out.println(cities);
//		System.out.println(repository.findAll());

		// READ by id
//		System.out.println(repository.findById(2));

		// CREATE
//		repository.save(new City("Москва"));

		// Update
//		System.out.println(repository.findAll());
//		repository.save(new City(5, "Moscow"));
//		System.out.println(repository.findAll());


		// CRUD
		// Delete
//		System.out.println(repository.findAll());
//		repository.deleteById(5);
//		System.out.println(repository.findAll());

//		PersonRepository repository = context.getBean(PersonRepository.class);
//		System.out.println(repository.findAll());
//		System.out.println(repository.findWhereAgeMoreThan28());
	}
}
