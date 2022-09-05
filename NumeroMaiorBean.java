package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class NumeroMaiorBean implements Serializable {
@Getter @Setter private Double n1;
@Getter @Setter private Double n2;
@Getter @Setter private Double n3;
@Getter @Setter private Double resultado;

public void Calcular() {
    if (n1 > n3 && n3 > n2) {
        resultado = n1;
    } else if (n2 > n1 && n1 >= n3) {
        resultado = n2;
    } else if (n2 > n3 && n3 > n1) {
        resultado = n2;

    } else if (n3 > n1 && n1 > n2) {
        resultado = n3;

    } else if (n3 > n2 && n2 > n1) {
        resultado = n3;

    }
}

}
