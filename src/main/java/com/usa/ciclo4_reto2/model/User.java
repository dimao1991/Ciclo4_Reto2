package com.usa.ciclo4_reto2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
/*
 *
 * @autor
 */
public class User {
    @Id
    /*
     *Atributos
     */
    private Integer id;
    /*
     *Atributos
     */
    private String identification;
    /*
     *Atributos
     */
    private String name;
    /*
     *Atributos
     */
    private String address;
    /*
     *Atributos
     */
    private String cellPhone;
    /*
     *Atributos
     */
    private String email;
    /*
     *Atributos
     */
    private String password;
    /*
     *Atributos
     */
    private String zone;
    /*
     *Atributos
     */
    private String type;
}
