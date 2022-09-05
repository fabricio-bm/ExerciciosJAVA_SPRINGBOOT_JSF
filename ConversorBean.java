package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


import javax.faces.view.ViewScoped;
import java.io.Serializable;
@ViewScoped
@Component
public class ConversorBean implements Serializable {


        @Getter @Setter private Double m;
        @Getter @Setter private Double cm;

        public void Calcular () {
            cm = m * 100;

        }
    }


