package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    @Autowired
    private ApplicationContext context;

    public static  ApplicationContext myContext;

    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        //create code to make sure that inventory is between min and max values
        if(part.getInv() > part.getMaxInv()){
            //display error message if inv is greater than the max allowed.
            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Fix your inventory if it is" +
                    " greater than the max inventory value.");
            return false;
        } else if (part.getInv() < part.getMinInv()){
            constraintValidatorContext.buildConstraintViolationWithTemplate("Solution: Increase your inventory if is" +
                    " is less than the min inventory value.");
            return false;
        }
        return true;
    }
}
