package org.example;

public class IDValidator implements Validator{
    public IDValidator(int id) {
        this.id = id;
    }
    private int id;

    public String getMessage() {
        return "Invalid Id";
    }
    @Override
    public boolean isValid() {
        if (this.id <0){
            return false;
        } return true;
    }
}
