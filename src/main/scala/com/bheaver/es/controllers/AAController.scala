package com.bheaver.es.controllers

import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import reactor.core.publisher.Mono

@RestController
class AAController {

  @RequestMapping(path = Array("/sayHi"))
  def sayHello = Mono just "Hello NGL"

}
