package it.epicode.menu;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import it.epicode.ingredienti.toppings;

import java.util.ArrayList;
import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class pizze {

    private String nome;
    private int prezzo;
    private String descrizione;

   List<toppings> toppings = new ArrayList<>

}