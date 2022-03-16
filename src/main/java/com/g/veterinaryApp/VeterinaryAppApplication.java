package com.g.veterinaryApp;

import com.g.veterinaryApp.model.Hayvan;
import com.g.veterinaryApp.model.Sahip;
import com.g.veterinaryApp.repository.HayvanRepository;
import com.g.veterinaryApp.repository.SahipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VeterinaryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryAppApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner mapDemo(HayvanRepository hayvanRepository, SahipRepository sahipRepository){
		return args -> {

			sahipRepository.save(new Sahip("sahip isim1","1234567890","email1"));
			sahipRepository.save(new Sahip("sahip isim2","1234567891","email2"));
			sahipRepository.save(new Sahip("sahip isim3","1234567892","email3"));

			hayvanRepository.save(new Hayvan("hayvan1","cins1",1,"açıklama1"));
			hayvanRepository.save(new Hayvan("hayvan2","cins2",2,"açıklama2"));
			hayvanRepository.save(new Hayvan("hayvan3","cins3",3,"açıklama3"));

			List<Hayvan> hayvanList=hayvanRepository.findByCins("cins1");
			hayvanList.forEach(System.out::println);


			List<Sahip> sahipList=sahipRepository.findAll();
			sahipList.forEach(System.out::println);
			System.out.println(sahipRepository.findByIsim("sahip isim2").getEmail());

		};
	}
	*/

}
