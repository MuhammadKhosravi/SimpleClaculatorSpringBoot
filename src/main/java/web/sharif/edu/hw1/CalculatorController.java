package web.sharif.edu.hw1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calc/{operator}/{op1}/{op2}")
    public String calc(@PathVariable String operator, @PathVariable String op1, @PathVariable String op2) {
        int int_op1 = Integer.parseInt(op1);
        int int_op2 = Integer.parseInt(op2);

        return switch (operator) {
            case "sum" -> int_op1 + " + " + int_op2 + " = " + (int_op1 + int_op2);
            case "subtract" -> int_op1 + " - " + int_op2 + " = " + (int_op1 - int_op2);
            case "mult" -> int_op1 + " * " + int_op2 + " = " + (int_op1 * int_op2);
            case "div" -> int_op1 + " / " + int_op2 + " = " + ((float) int_op1 / (float) int_op2);
            default -> "Invalid operator";
        };
    }

}
