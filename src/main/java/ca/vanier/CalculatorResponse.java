package ca.vanier;

public class CalculatorResponse {
    private String statue;
    private String operation;
    private String value1;
    private String value2;
    private double result;
    private String detailMessage;

    //default constructor
    public CalculatorResponse(){

    }
    //Initialized constructor
    public CalculatorResponse(String statues, String operation, String value1, String value2, double result, String detailMessage){
        this.statue = statues;
        this.operation = operation;
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
        this.detailMessage = detailMessage;
    }

    //getter and setters
    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    // toString method

    @Override
    public String toString() {
        return " Operation statue: " + statue +
                "\n Operation: " + operation +
                "\n Value1: " + value1 +
                "\n Value2: " + value2 +
                "\n Result: " + result +
                "\n DetailMessage: " + detailMessage;
    }
}
