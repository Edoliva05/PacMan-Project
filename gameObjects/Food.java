package gameObjects;

import abstracts.Drawable;
import java.awt.*;
import java.util.Random;
import utils.Coordinates;
import utils.DrawingInformation;

public class Food extends Drawable {

    private boolean deleted = false;   //variabile che indica se è stato mangiato inizializzata a false

    public Food(Coordinates coords) {
        super(coords);
    }

    @Override
    public void update() {}

    @Override
    public DrawingInformation draw() {
        if(!this.deleted){
            Random rand = new Random();
            if(rand.nextInt(2) == 1)   //in questo modo mi cambia il colore del Food continuamente dando un effetto lampeggiante
                return new DrawingInformation('f', new Color(144, 238, 144));  //colore verde chiaro
            else
                return new DrawingInformation('f', new Color(124, 205, 124));  //colore verde chiaro diverso dal primo
        }else
            return new DrawingInformation(' ', Color.BLACK);  //se il cibo viene mangiato lo faccio sparire, mettendolo nero su sfondo nero

    }

    //funzione che imposta la variabile "deleted" a true se viene mangiato
    public void markAsDeleted() {
        this.deleted = true;  
    }

    //funzione che restituisce la variabile deleted per capire se è stato mangiato oppure no
    public boolean isDeleted() {
        return this.deleted;   
    }

}
