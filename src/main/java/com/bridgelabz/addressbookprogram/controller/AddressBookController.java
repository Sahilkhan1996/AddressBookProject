package com.bridgelabz.addressbookprogram.controller;

import com.bridgelabz.addressbookprogram.exception.ContactNotFoundException;
import com.bridgelabz.addressbookprogram.model.AddressBook;
import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;
import com.bridgelabz.addressbookprogram.service.AddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping("/")
    public String Welcome() {
        return "Welcome to Address Book Program";
    }

    @PostMapping("/create")
    public AddressBook CreateContact(@RequestBody @Valid AddressBook addressBook) {
        return addressBookService.createContacts(addressBook);
    }

    @GetMapping("/getcontact/{sno}")
    public AddressBook getContact(@PathVariable Long sno) {
        return addressBookService.getContactsFromDb(sno);
    }

    @GetMapping("/getlist/")
    public List<AddressBook> getAllContact() {
        return addressBookService.getAllContactsFromDb();
    }


    @PutMapping("/updatecontact/{sno}")
    public AddressBook updateContacts(@PathVariable Long sno, @RequestBody AddressBook addressBook) {
        return addressBookService.updateContacts(sno, addressBook);
    }

    @DeleteMapping("/deletecontact/{sno}")
    public void deleteContacts(@PathVariable Long sno) {
        addressBookService.deleteContacts(sno);
    }

    @GetMapping("/getcontactdto/{sno}")
    public AddressBookDTO getAllContact(@PathVariable Long sno) throws ContactNotFoundException {
        return addressBookService.getContactsFromDbDTO(sno);

    }


}
