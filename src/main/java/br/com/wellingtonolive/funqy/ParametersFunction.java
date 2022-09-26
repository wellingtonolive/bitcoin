package br.com.wellingtonolive.funqy;

import br.com.wellingtonolive.funqy.util.Parameters;
import io.quarkus.funqy.Funq;

public class ParametersFunction {

    @Funq("parameters")
    public String parameters(){


        String valueForParameter = Parameters.getValueForParameter();

        System.out.println("RESPONSE CONSULTA PARAMETROS: " + valueForParameter);

        String createParameter = Parameters.createParameters();

        System.out.println("RESPONSE CREATE: " + createParameter);

        return valueForParameter;



    }
}
