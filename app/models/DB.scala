package models

/**
 * Created by Pazhman
 */
import sorm._


object DB extends Instance ( entities = Set( Entity[Cat]() ),  url = "jdbc:h2:mem:test")













