package com.example.apip1

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class AddContactActivity : AppCompatActivity() {
    private val contactViewModel: ContactViewModel by lazy {
        ViewModelProvider(this, ContactViewModelFactory((application as ContactApplication).repository)).get(ContactViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)

        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val address = etAddress.text.toString().trim()

            if (name.isNotEmpty() && phone.isNotEmpty() && email.isNotEmpty() && address.isNotEmpty()) {
                val contact = Contact(name = name, phone = phone, email = email, address = address)
                contactViewModel.insertContact(contact)
                finish()
            }
        }
    }
}