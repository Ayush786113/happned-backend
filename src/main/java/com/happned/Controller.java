package com.happned;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*")
@RestController
public class Controller {
    @Autowired
    Service service;
    @PostMapping("/")
    public ResponseEntity<Object> getProfile(@RequestBody String token){
        try{
            return new ResponseEntity<>(service.getProfile(token), HttpStatus.OK);
        } catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/recs")
    public ResponseEntity<Object> getRecs(@RequestBody String token){
        try{
            return new ResponseEntity<>(service.getRecommendations(token), HttpStatus.OK);
        } catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/")
    public ResponseEntity<String> keepAlive(){
    	return new ResponseEntity<>("I am alive :)", HttpStatus.OK);
    }
    
//    @GetMapping("/like/{id}")
//    public ResponseEntity<Object> likeProfile(@RequestBody String token, @PathVariable String id){
//        try{
//            return new ResponseEntity<>(service.likeProfile(token, id), HttpStatus.OK);
//        } catch (Exception exception){
//            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//    }
}
