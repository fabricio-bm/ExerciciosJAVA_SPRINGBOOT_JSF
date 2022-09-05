package br.edu.unifio.primeirotrabalhoparcial.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ViewScoped
@Component
public class FatorialBean implements Serializable {

@Getter @Setter
private Integer x;

@Getter @Setter   private Integer f;


public void Calcular(){
    f=x;
            while(x>1){
                f=f*(x-1);
                x--;
            }


        }
}
