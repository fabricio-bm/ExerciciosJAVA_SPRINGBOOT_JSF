package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class MediaSemestreBean implements Serializable {
   @Getter @Setter private Double n1;
   @Getter  @Setter private Double n2;
   @Getter  private Double mf;
@Getter @Setter   private String conceito;

public void Calcular(){
    mf = (n1 + n2) / 2;
    if(mf >= 9.0){

        conceito = "Aprovado";
    } else if (mf>=7.5 && mf<9) {

        conceito = "Aprovado";
    } else if (mf>=6.0 && mf <7.5) {

        conceito = "Aprovado";
    } else if (mf>=4.0 && mf<6.0) {

        conceito = "Reprovado";
    } else if (mf<4 && mf==0) {

        conceito = "Reprovado";
    }
}
}
