package za.ac.cput.domain;

import java.io.Serializable;

/**
 * Created by LILO on 2016/04/02.
 */
public class Deductible implements Serializable{

    public boolean isDeductible(){
        System.out.print("Deductible: Validating health insurance claim.....\n");
        return true;
    }
}
