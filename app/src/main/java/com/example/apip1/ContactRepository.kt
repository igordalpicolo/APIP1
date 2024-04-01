package com.example.apip1

class ContactRepository(private val contactDao: ContactDao) {
    fun getAllContacts() = contactDao.getAllContacts()

    fun insertContact(contact: Contact) {
        contactDao.insertContact(contact)
    }
}