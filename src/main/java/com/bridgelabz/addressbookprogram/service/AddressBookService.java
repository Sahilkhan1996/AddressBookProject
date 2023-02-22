package com.bridgelabz.addressbookprogram.service;

import com.bridgelabz.addressbookprogram.exception.ContactNotFoundException;
import com.bridgelabz.addressbookprogram.model.AddressBook;
import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;
import com.bridgelabz.addressbookprogram.repository.IAddressBookRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Autowired
    IAddressBookRepo iAddressBookRepo;
    @Autowired
    ModelMapper modelMapper;

    public AddressBook createContacts(AddressBook addressBook) {
        return iAddressBookRepo.save(addressBook);
    }

    public AddressBook getContactsFromDb(Long sno) {
        return iAddressBookRepo.findById(sno).orElse(null);
    }

    public List<AddressBook> getAllContactsFromDb() {
        return (List<AddressBook>) iAddressBookRepo.findAll();
    }

    public AddressBookDTO getContactsFromDbDTO(Long sno) throws ContactNotFoundException {
        try{
            AddressBook addressBook = iAddressBookRepo.findById(sno).get();
            return modelMapper.map(addressBook, AddressBookDTO.class);
        }catch (Exception e){
            e.getStackTrace();
            throw new ContactNotFoundException("Please enter the valid serial number!");

        }



        //return covertorFromIntityToDTO(addressBook);
        //return new AddressBookDTO(addressBook.getSno(), addressBook.getFirstName(), addressBook.getLastName());
    }

    @Override
    public AddressBook updateContacts(Long sno, AddressBook addressBook) {
        addressBook.setSno(sno);
        return iAddressBookRepo.save(addressBook);
    }

    @Override
    public void deleteContacts(Long sno) {
        iAddressBookRepo.deleteById(sno);
    }


//    public AddressBookDTO covertorFromIntityToDTO(AddressBook addressBook){
//        return new AddressBookDTO(addressBook.getSno(), addressBook.getFirstName(), addressBook.getLastName());
//    }

}
