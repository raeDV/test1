package ca.vanier;

import java.net.CacheResponse;

public class Calculator {
    
    public static String execute(String[] args) throws Exception{
        //should receive arguments in this format["SUM" "12" "2"]
        //Convert the arguments received
        String str = "";
        double num1 = 0;
        double num2 = 0;
        try{
            str = args[0];
            num1 = Double.parseDouble(args[1]);
            num2 = Double.parseDouble(args[2]);
        }catch(NumberFormatException e){ //handling the NumberFormatException
            System.out.println("Please check the numbers you entered and try again later!");
            e.printStackTrace();
            System.out.println("The result is: \n" + new CalculatorResponse("Fail", args[0].toUpperCase(), args[1], args[2], 0, "Check numbers you entered please!"));
            System.exit(0);
        }catch(ArrayIndexOutOfBoundsException e){ //handling the ArrayIndexOutOfBoundsException
            System.out.println("Please make sure you entered 2 numbers!");
            e.printStackTrace();
            System.exit(0);
        }
        double result = 0;
        //Operation conditions
        //Addation
        if(str.equalsIgnoreCase("SUM")){
            result = num1 + num2;
            return String.format("The result is: \n" + new CalculatorResponse("Succeed", args[0].toUpperCase(), args[1], args[2], result, "Operation executed successful!"));
        //Substraction
        }else if(str.equalsIgnoreCase("Minus")){
            result = num1 - num2;
            return String.format("The result is: \n" + new CalculatorResponse("Succeed", args[0].toUpperCase(), args[1], args[2], result, "Operation executed successful!"));
        //Multiplication
        }else if(str.equalsIgnoreCase("Multiply")){
            result = num1 * num2;
            return String.format("The result is: \n" + new CalculatorResponse("Succeed", args[0].toUpperCase(), args[1], args[2], result, "Operation executed successful!"));
        //Division
        }else if(str.equalsIgnoreCase("Divide")){
            result = num1 / num2;
            return String.format("The result is: \n" + new CalculatorResponse("Succeed", args[0].toUpperCase(), args[1], args[2], result, "Operation executed successful!"));
        }else{
        //Throw exceptions when operation no recognized is entered by user
            throw new Exception("Operation not found!"); 
        }

        
    }
    public static CalculatorResponse sumIT(String operation, double num1, double num2){
        double result = num1 + num2;
        CalculatorResponse response = new CalculatorResponse();
        response.setStatue("Success");
        response.setOperation(operation);
        response.setValue1(""+num1);
        response.setValue1(""+num2);
        response.setResult(result);
        return response;
    }

    
    
}
