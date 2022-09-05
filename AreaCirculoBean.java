package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@ViewScoped
@Component
public class AreaCirculoBean {
    @Getter @Setter private Double raio;
    @Getter @Setter private Double área;
    private Double pi = 3.14;

    public void Calcular(){
        área = pi * (raio*raio);
    }

}
