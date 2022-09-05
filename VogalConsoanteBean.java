package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class VogalConsoanteBean implements Serializable {
   @Getter @Setter private String status;
    @Getter @Setter private String letra;

    public void calcular(){
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            status = "Vogal";
        }
        else {
            status = "Consoante";
        }
    }

}
