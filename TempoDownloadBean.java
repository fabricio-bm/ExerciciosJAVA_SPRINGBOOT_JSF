package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class TempoDownloadBean {
    @Getter @Setter private Double arq;
    @Getter @Setter private Double velocidade;
    @Getter @Setter private Double tempo;

    public void Calcular(){
        tempo = (arq / velocidade) * 60;
    }

}
