package com.example.trocajanelalive;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private FlowPane menu;
    @FXML
    private FlowPane conteudo;

    public Void trocarJanela(String nomeTela){
        System.out.println("O nome da tela é "+nomeTela);
        return null;
    }

    @FXML
    private void initialize() throws IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("menu.fxml"));
            Node menuCarregado = fxmlLoader.load();
            menu.getChildren().add(menuCarregado);
            Object variavelMenuControle = fxmlLoader.getController();
            if(variavelMenuControle instanceof MenuController)
                ((MenuController) variavelMenuControle).callBack = this::trocarJanela;

            fxmlLoader = new FXMLLoader(PrincipalController.class.getResource("inicio.fxml"));
            Node principal = fxmlLoader.load();
            conteudo.getChildren().add(principal);
        }catch (Throwable t){
            t.printStackTrace();
        }

    }

}