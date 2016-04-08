package za.ac.cput.domain;

import java.io.Serializable;

/**
 * Created by LILO on 2016/04/02.
 */
public class Coverage implements Serializable {

    public boolean isCovered(){
        System.out.print("Coverage: Validating health insurance claim.....\n");
        return true;

    }
    public static class Builder{

        public Coverage build(){return  new Coverage();}
    }
}
