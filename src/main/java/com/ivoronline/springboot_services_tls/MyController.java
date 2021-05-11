package com.ivoronline.springboot_services_tls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/nt-ms")
public class MyController {

  @RequestMapping(value = "/data", method = RequestMethod.GET)
  public String NtMsController() {
    return "Hello from Controller";
  }

}
