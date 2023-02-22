package com.bridgelabz.addressbookprogram.repository;

import com.bridgelabz.addressbookprogram.model.AddressBook;
import org.springframework.data.repository.CrudRepository;

public interface IAddressBookRepo extends CrudRepository<AddressBook,Long> {
}
