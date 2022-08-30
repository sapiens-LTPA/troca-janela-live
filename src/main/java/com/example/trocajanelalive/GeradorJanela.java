package com.example.trocajanelalive;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class GeradorJanela {

    public Node criaJanela(String nomeTela) throws IOException {
        Node janela = null;
        if(nomeTela.equals("inicio")){
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("inicio.fxml"));
            janela = fxmlLoader.load();
        }else if(nomeTela.equals("janela2")){
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("janela2.fxml"));
            janela = fxmlLoader.load();
        }
        return janela;
    }
}
