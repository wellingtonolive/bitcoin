package br.com.wellingtonolive.funqy;


public class Payload {

    private Boolean IsHelloWorldExample;

    public Payload(Boolean isHelloWorldExample) {
        IsHelloWorldExample = isHelloWorldExample;
    }

    public Boolean getHelloWorldExample() {
        return IsHelloWorldExample;
    }

    public void setHelloWorldExample(Boolean helloWorldExample) {
        IsHelloWorldExample = helloWorldExample;
    }
}
