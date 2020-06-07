package com.ligerlearn.example.model.records;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A simple representation of an "address" with the intent of it being stored as a JSON
 * field in a separate entity.
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class Address implements Serializable {
    private final static long serialVersionUID = 7702L;

    private int doorNumber;
    private String roadName;
    private String postalCode;

}