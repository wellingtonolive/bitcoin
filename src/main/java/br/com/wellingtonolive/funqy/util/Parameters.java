package br.com.wellingtonolive.funqy.util;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.*;

public class Parameters {

    public static String getValueForParameter(){

        System.out.println("Parameters.getValueForParameter -- INIT");

        try{

            SsmClient ssmClient = SsmClient.builder()
                    .region(Region.US_EAST_1)
                    .build();

            System.out.println(ssmClient);

            GetParameterRequest parameterRequest = GetParameterRequest.builder()
                    .name("/api/entrypoint/sample/path")
                    .build();

            System.out.println("GetParameterRequest ::" + parameterRequest);

            GetParameterResponse parameterResponse = ssmClient.getParameter(parameterRequest);

            System.out.println("GetParameterResponse ::" + parameterResponse);

            System.out.println("Parameters Response: " + parameterResponse);

            return parameterResponse.parameter().value();

        }catch (SsmException e){

            System.out.println("Deu errroooooooo :::: ");
            System.out.println(e);

            return e.toString();
        }
    }

    public static String createParameters(){

        try{

            SsmClient ssmClient = SsmClient.builder()
                    .region(Region.US_EAST_1)
                    .build();

            PutParameterRequest putParameterRequest = PutParameterRequest.builder()
                    .name("/api/homologacao/sample/entrypoint")
                    .type(ParameterType.STRING)
                    .value("xpto da vida teste criacao")
                    .description("teste com integracao")
                    .build();

            PutParameterResponse putParameterResponse = ssmClient.putParameter(putParameterRequest);

            ssmClient.putComplianceItems()


            return putParameterResponse.toString();

        }catch (SsmException e){

            System.out.println("Deu errroooooooo :::: ");
            System.out.println(e);

            return e.toString();

        }


    }
}
