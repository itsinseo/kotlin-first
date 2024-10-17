package example.kotlinfirst.entity

import org.springframework.data.annotation.Id

data class Message(val text: String, @Id val id: String? = null)
