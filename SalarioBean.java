package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component

public class SalarioBean implements Serializable {

    @Getter @Setter private Double horastrabalhadas;
    @Getter @Setter private Double salarioBruto;
    @Getter @Setter private Double ir;
    @Getter @Setter private Double salarioLiquido;
    @Getter @Setter private Double inss;
    @Getter @Setter private Double ganhoporhora;
    @Getter @Setter private Double varglobal;
    @Getter @Setter private Double desc;

    public void Calcular(){
    salarioBruto = ganhoporhora * horastrabalhadas;
    ir = salarioBruto * 0.11;
    inss = ir * 0.11;
    desc = inss * 0.5;
    varglobal = desc;
    salarioLiquido = salarioBruto - varglobal;

    }

}
