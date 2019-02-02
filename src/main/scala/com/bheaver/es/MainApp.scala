package com.bheaver.es

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MainApp

object MainApp extends App {
  SpringApplication.run(classOf[MainApp])
}
