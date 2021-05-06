package com.jaz.pjatk.component.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeWorkRestController {

    @GetMapping("/{pathVar}")
    public ResponseEntity<String> getWithPathVariable(@PathVariable String pathVar){
        return ResponseEntity.ok(pathVar);
    }

    @GetMapping("/query")
    public ResponseEntity<String> getWithRequestParam(@RequestParam String value){
        return ResponseEntity.ok(value);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JsonNode> putWithPathVariableAndRequestBody(@PathVariable Long id,@RequestBody JsonNode jsonNode){
        return ResponseEntity.ok(((ObjectNode) jsonNode).put("id", id));
    }

    @PostMapping("/")
    public ResponseEntity<JsonNode> postWithRequestBody(@RequestBody JsonNode jsonNode){
        return ResponseEntity.ok(jsonNode);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }

}
