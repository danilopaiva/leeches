package com.github.danilopaiva.bank.domain.helper

import com.github.danilopaiva.bank.domain.Customer

fun dummyCustomer() =
    Customer(
        name = Customer.Name("Danilo Paiva"),
        email = Customer.Email("danilopaivasilva@gmail.com"),
        document = Customer.Document(
            type = Customer.Document.Type.DRIVER_LICENSE,
            number = Customer.Document.Number("123456")
        )
    )