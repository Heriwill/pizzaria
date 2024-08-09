package com.itb.mif3an.pizzaria.exceptions;

public class BadRequest extends RuntimeException{ //extends é a extensao, herança; Badrequest herda de Runtime...
public BadRequest(String message){
        super(message);
    }
}
