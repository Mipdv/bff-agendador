package com.javanauta.bff_agendador.infrastructure.exceptions;

public class ConflictExcpection extends RuntimeException{
    public ConflictExcpection(String mensagem){
        super(mensagem);
    }

    public ConflictExcpection(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
