package com.sunbeam;

class ExceptionLineTooLong extends Exception {

    public ExceptionLineTooLong() {
        super("The string is too long");
    }
}
