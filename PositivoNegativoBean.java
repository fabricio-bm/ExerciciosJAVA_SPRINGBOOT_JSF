package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class PositivoNegativoBean implements Serializable {
      @Getter @Setter private String status;
   @Getter @Setter private Double numero;
   public void Calcular(){
       if(numero < 0 ){
            status = "negativo";
       } else if(numero > 0 ){
           status = "positivo";
       } else{
           status="igual a zero";
       }
   }

}

