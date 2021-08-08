package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "user")
class User(name: String, email: String) {

    @Id
    var id: Long? = null
    var name: String = name
    var email: String = email

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "User(id=$id, name='$name', email='$email')"
    }
}