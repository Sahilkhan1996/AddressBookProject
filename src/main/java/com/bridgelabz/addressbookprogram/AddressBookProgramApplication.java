package com.bridgelabz.addressbookprogram;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressBookProgramApplication {
@Bean
public ModelMapper modelMapper(){
    return new ModelMapper();
}


    public static void main(String[] args) {

        SpringApplication.run(AddressBookProgramApplication.class, args);
    }


}
