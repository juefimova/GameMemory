package com.example.game;

public class Context {
    public static Context getInstance() {
        if(instance==null){
            instance = new Context();
        }
        return instance;
    }
    private static Context instance = null;
    private Context() {

    }
    public Errors getErrors() {
        return errors;
    }
    public void setErrors(Errors errors) {
        this.errors = errors;
    }
    Errors errors;
    ErrorController errorController;


    public ErrorController getErrorController() {
        return errorController;
    }

    public void setErrorController(ErrorController errorController) {
        this.errorController = errorController;
    }

}
