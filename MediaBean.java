package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class MediaBean implements Serializable {
  @Getter @Setter private Double m1;
    @Getter @Setter private Double m2;
    @Getter @Setter private Double m3;
    @Getter @Setter private String status;

    public void Calcular(){
    m3 = (m1 + m2) / 2;
    if(m3 >= 7){
        status = "Aprovado";
    }
    else if (m3 < 4){
        status = "Reprovado";
        }
    else if (m3 >= 4 || m3 < 7){
        status = "Exame";
        }
    }
}
