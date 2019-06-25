package com.spread.ydy.java8.chap08;

public class ValidatorLambda {

    public static void main(String[] args) {
        ValidatorLambda numericValidator = new ValidatorLambda((String s) -> s.matches("[a-z]+"));
        boolean b1 = numericValidator.validate("aaaaa");
        System.out.println(b1);

        ValidatorLambda lowerCaseValidator = new ValidatorLambda((String s) -> s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validate("bbbbb");
        System.out.println(b2);
    }

    private final ValidationStrategy strategy;

    public ValidatorLambda(ValidationStrategy strategy) {
        super();
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
