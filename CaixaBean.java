package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class CaixaBean implements Serializable {

    @Getter
    @Setter
    private Integer valorsaque;
    @Getter
    @Setter
    private Integer cem;
    @Getter
    @Setter
    private Integer dois;
    @Getter
    @Setter
    private Integer cincum;
    @Getter
    @Setter
    private Integer dez;
    @Getter
    @Setter
    private Integer cinquenta;

    @Getter
    @Setter
    private Integer notas;

    public void Calcular() {
        if (valorsaque >= 10 || valorsaque <= 600) {
            cem=(valorsaque/100);
            valorsaque = valorsaque % 100;

            cinquenta = (valorsaque/50);
            valorsaque = valorsaque%50;

            dez = (valorsaque/10);
            valorsaque = valorsaque%10;

            cincum = (valorsaque/5);
            valorsaque=valorsaque%5;

            dois = (valorsaque/2);
            valorsaque=valorsaque%2;
            }
        }
    }

