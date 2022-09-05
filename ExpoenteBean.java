package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@Component
@ViewScoped
public class ExpoenteBean implements Serializable {

    @Getter
    @Setter
    private Double base;

    @Getter
    @Setter
    private Integer exp;

    @Getter
    @Setter
    private double soma = 1;

    @Getter
    @Setter
    private Double d;

    public void Calcular() {
        soma = 1;
        for (int i = exp; i >= 1; i--) {
            soma = soma * base;
        }
    }
}


