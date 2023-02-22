package com.bridgelabz.addressbookprogram.dto;


import lombok.Data;

@Data
public class AddressBookDTO {
//    public AddressBookDTO(AddressBook addressBook){
//        this.sno = addressBook.getSno();
//        this.firstName = addressBook.getFirstName();
//        this.lastName = addressBook.getLastName();
//    }

    private Long sno;
    private String firstName;
    private String lastName;


}
