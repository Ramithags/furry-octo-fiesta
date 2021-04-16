package com.xml.rest.contentnegotiation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content")
public class ContentNegotiationController {

    @PostMapping(value = "/xml", consumes = {"application/xml"}, produces = {"application/xml"})
    public ResponseEntity<Message> postXMLRequest(@RequestBody Message message) {
        System.out.println(message.getId());
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
}
