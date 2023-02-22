package com.bridgelabz.addressbookprogram.service;

import com.bridgelabz.addressbookprogram.exception.ContactNotFoundException;
import com.bridgelabz.addressbookprogram.model.AddressBook;
import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;

import java.util.List;

public interface IAddressBookService {
    AddressBook createContacts(AddressBook addressBook);

    AddressBook getContactsFromDb(Long sno);

    List<AddressBook> getAllContactsFromDb();

    AddressBookDTO getContactsFromDbDTO(Long sno) throws ContactNotFoundException;

    AddressBook updateContacts(Long sno, AddressBook addressBook);

    void deleteContacts(Long sno);
}
