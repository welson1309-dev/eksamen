package EksamensTræning.opgave13;

import java.util.Random;

public class JuleGave {
    boolean isSoft, isRectangular, doesRattle;


    public JuleGave(){
       isRectangular = Math.random() < 0.5;
       isSoft = Math.random() < 0.5;
       doesRattle = Math.random() < 0.5;
    }

    public boolean isLego(){
       return !isSoft && doesRattle && isRectangular;
    }
}
