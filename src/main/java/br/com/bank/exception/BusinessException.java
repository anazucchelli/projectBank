package br.com.bank.exception;

public class BusinessException extends Exception {
    public BusinessException(String message) {
        super(message);
    }
}