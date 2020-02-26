//package com.github.divya.QuizApp.controller;
//
//import com.github.divya.QuizApp.entities.User;
//import com.github.divya.QuizApp.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//public class UserController {
//    @Controller
//    @RequestMapping("/users")
//    public class UserController {
//
//        @Autowired
//        private UserService service;
//
//        @RequestMapping
//        public String getUsersPage() {
//            return "users";
//        }
//
//
//
//        @RequestMapping(value="/get")
//        public @ResponseBody User get(@RequestBody User user) {
//            return service.read(user);
//        }
//
//        @RequestMapping(value="/create", method= RequestMethod.POST)
//        public @ResponseBody User create(
//                @RequestParam String username,
//                @RequestParam String password,
//                @RequestParam String firstName,
//                @RequestParam String lastName,
//                @RequestParam String email) {
//
//            User newUser = new User();
//
//            newUser.setUserName(username);
//            newUser.setPassword(password);
//            newUser.setFirstName(firstName);
//            newUser.setLastName(lastName);
//            newUser.setEmail(email);
//            return service.create(newUser);
//        }
//
//        @RequestMapping(value="/update", method=RequestMethod.POST)
//        public @ResponseBody User update(
//                @RequestParam String username,
//                @RequestParam String firstName,
//                @RequestParam String lastName,
//                @RequestParam String password,
//                @RequestParam String email,
//                @RequestParam String type)
//
//
//                 {
//
//
//            User existingUser = new User();
//            existingUser.setUserName(username);
//            existingUser.setFirstName(firstName);
//            existingUser.setLastName(lastName);
//            existingUser.setPassword(password);
//            existingUser.setEmail(email);
//            existingUser.setEmail(type);
//
//            return service.update(existingUser);
//        }
//
//        @RequestMapping(value="/delete", method=RequestMethod.POST)
//        public @ResponseBody Boolean delete(
//                @RequestParam String username) {
//
//            User existingUser = new User();
//            existingUser.setUserName(username);
//
//            return service.delete(existingUser);
//        }
//    }
//}
