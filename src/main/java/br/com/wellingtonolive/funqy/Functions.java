package br.com.wellingtonolive.funqy;



import io.quarkus.funqy.Funq;


import java.util.UUID;


public class Functions {

    String stateMachineArn = "arn:aws:states:us-east-1:772742445677:stateMachine:HelloWorld";

    @Funq("stepfunction")
    public String greet() {


        //Retirar JSONOBJECT
        // FAZER ASSIM A CHAMADA PARA WORKFLOW

//
//        SfnClient sfnClient = SfnClient.builder()
//                .region(Region.US_EAST_1)
//                .build();
//
//        System.out.println(sfnClient);
//
//        String exeArn = startWorkflow(sfnClient,stateMachineArn);
//        System.out.println(exeArn);
//
//        System.out.println("Exeucao :::" + exeArn);
//        sfnClient.close();

        return "Hello WORLD";
    }

//    private String startWorkflow(SfnClient sfnClient, String stateMachineArn) {
//
//        UUID uuid = UUID.randomUUID();
//        String uuidValue = uuid.toString();
//
//        try{
//
//            Payload body = new Payload(true);
//
//            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//            String json = ow.writeValueAsString(body);
//
//
//            System.out.println(json);
//
//            StartExecutionRequest executionRequest = StartExecutionRequest.builder()
//                    .input(json)
//                    .stateMachineArn(stateMachineArn)
//                    .name(uuidValue)
//                    .build();
//
//            System.out.println("executionRequest" + executionRequest);
//
//            StartExecutionResponse startExecutionResponse = sfnClient.startExecution(executionRequest);
//
//            System.out.println("startExecutionResponse" + startExecutionResponse);
//
//            return startExecutionResponse.executionArn();
//
//        }catch (Exception e){
//            System.out.println("DEU ERROOO");
//            System.out.println(e);
//
//        }
//
//        return "";
//    }
}
