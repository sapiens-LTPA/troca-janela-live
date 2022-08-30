package com.example.trocajanelalive;

import java.util.function.Function;

public class MenuController {

    Function<String,Void> callBack;
    public void inicio(){
        if(callBack != null){
            callBack.apply("inicio");
        }
    }

    public void janela2(){
        if(callBack != null){
            callBack.apply("janela2");
        }
    }
}
