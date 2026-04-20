package EksamensTræning.fraEK.opgave13;

import java.util.Random;

public class JuleGave {
    boolean isSoft, isRectangular, doesRattle;


    public JuleGave(){
        Random random = new Random();
       isRectangular = Math.random() < 0.5;
       isSoft = Math.random() < 0.5;
       doesRattle = Math.random() < 0.5;
       doesRattle= random.nextBoolean();
    }

    public boolean isLego(){
       return !isSoft && doesRattle && isRectangular;
    }
}
