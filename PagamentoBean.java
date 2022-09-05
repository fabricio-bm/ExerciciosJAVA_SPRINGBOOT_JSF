package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class PagamentoBean implements Serializable {
    @Getter @Setter private Double salariobruto;
    @Getter @Setter private Double inss;
    @Getter @Setter private Double fgts;
    @Getter @Setter private Double ir;
    @Getter @Setter private Double salarioliquido;
    @Getter private Double valorhora;
    @Getter private Double qtdhoras;

    @Getter @Setter private Double totaldesc;


    public void Calcular(){
        valorhora = getValorhora();
        qtdhoras = getQtdhoras();
            salariobruto = valorhora * qtdhoras;
        if(salariobruto<=900){
            ir=null;
        } else if (salariobruto>900 || salariobruto == 1500) {
            ir = salariobruto * 5;

        } else if (salariobruto>1500 || salariobruto == 2500) {
            ir=salariobruto * 10;

        } else {
            ir=salariobruto * 20;
        }
        inss = salariobruto * 10;
        fgts = salariobruto * 11;
        totaldesc = ir + inss;
        salarioliquido = salariobruto - totaldesc;
    }
}
