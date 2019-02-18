package com.bheaver.es.controllers

import com.bheaver.ngl4.aa.services.AuthenticateServiceImpl
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import reactor.core.publisher.{Flux, Mono}

@RestController
class AAController {

  @RequestMapping(path = Array("/sayHi"))
  def sayHello = {
    new AuthenticateServiceImpl().authenticateUser("TSSHY01",Array('a','b','c'),"lib1")
  }





}
