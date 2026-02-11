package EksamensTræning.opgave14;

import java.util.List;

public class Image {
    String fileName;
    int height;
    int width;

    public Image(String fileName, int height, int width){
        this.fileName=fileName;
        this.height=height;
        this.width=width;
    }

    public boolean isKnownFileType(){
       return fileName.endsWith(".gif") ||
               fileName.endsWith(".jpg")||
               fileName.endsWith(".jpeg")||
               fileName.endsWith(".png")||
               fileName.endsWith(".webp")||
               fileName.endsWith(".bmp");

    }

    public boolean isKnownFileFormat(){
        List<String> formats = List.of(
                ".gif",".jpg",".jpeg",".png",".webp",".bmp");
        for (String type: formats){
            if (fileName.endsWith(type)){
                return true;
            }
        }return false;
    }

    public boolean isPortrait(){
        return height>width;
    }
    public boolean isLandscape(){
        return width>height;

    }
}
