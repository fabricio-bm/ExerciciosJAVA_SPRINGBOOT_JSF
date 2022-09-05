package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class TabajaraBean implements Serializable {
    @Getter @Setter private Double salariobruto;
    @Getter @Setter private Double salarioliquido;
    @Getter @Setter private String porcentagem;

    @Getter @Setter private Double valoraumento;

    public void Calcular(){
        if(salariobruto<=280){

            salarioliquido = (salariobruto * 20) / 100 + salariobruto;
            valoraumento = (salariobruto * 20) / 100;
            porcentagem = "+ 20%";
        
        } else if (salariobruto>280 || salariobruto<=700) {
            salarioliquido = (salariobruto * 15) / 100 + salariobruto;
            valoraumento = (salariobruto * 15) / 100;
            porcentagem = "+ 15%";


        } else if (salariobruto>700 || salariobruto<=1.500) {
            salarioliquido = (salariobruto * 10) / 100 + salariobruto;
            valoraumento = (salariobruto * 10) / 100;
            porcentagem = "+ 10%";    
        
        } else if (salariobruto>1.500) {
            salarioliquido = (salariobruto * 5) / 100 + salariobruto;
            valoraumento = (salariobruto * 5) / 100;
            porcentagem = "+ 5%";
        }
    }
}
