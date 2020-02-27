package com.optus.JavaString;
import java.util.Map;
import java.util.Properties;

public class EnvPropVariables {
    public static void main(String[] args){
        System.out.println("******************************Environment Vars*****************************");
        Map<String, String> enviorntmentVars  = System.getenv();
        enviorntmentVars.entrySet().forEach(System.out::println);

        System.out.println("windir=" + System.getenv("windir"));

        System.out.println("******************************GET Property Vars*****************************");
        Properties props = System.getProperties();
        props.entrySet().forEach(System.out::println);
        System.out.println("user dir="+ System.getProperty("user.dir"));

        System.out.println("******************************SET Property Vars*****************************");

    }
}
