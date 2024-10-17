package example.kotlinfirst.repository

import example.kotlinfirst.entity.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>