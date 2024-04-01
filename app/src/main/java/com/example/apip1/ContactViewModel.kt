package com.example.apip1

import androidx.lifecycle.ViewModel

class ContactViewModel(private val contactDao: ContactRepository) : ViewModel() {
    fun getAllContacts() = contactDao.getAllContacts();

    fun insertContact(contact: Contact){
        contactDao.insertContact(contact)
    }
}