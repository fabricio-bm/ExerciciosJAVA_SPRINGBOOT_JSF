package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class Temperatura {
    @Getter @Setter private Double f;
    @Getter @Setter private Double celsius;

    public void Calcular(){
        celsius = 5*(f - 32) / 9;
    }
}
