package com.usa.ciclo4_reto2.controller;

import com.usa.ciclo4_reto2.model.User;
import com.usa.ciclo4_reto2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")

public class Usercontroller {
    @Autowired
    private UserService userService;
    /**
     * Método para obtener el listado de Usuarios existentes
     *
     * @return listado de Usuarios formato JSON
     */

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
    /**
     * Método para crear un Usuario
     *
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody User user){
        userService.save(user);
    }
    /**
     * Método para actualizar un Usuario
     *
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public  User update(@RequestBody User user){
        return userService.update(user);
    }
    /**
     * Método para borrar un Usuario
     *
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return userService.delete(id);
    }
    /**
     * Método para Consultar un Email
     *
     * @param email Consultado
     * @return Usuario en formato JSON
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password){
        return userService.authenticateUser(email,password);
    }

    /**
     * Método para Consultar un email y password Usuario
     *
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists (@PathVariable("email") String email){
        return userService.emailExists(email);
    }
}
