package com.silvertree.tombstone.tiemulation.impl;

import com.silvertree.tombstone.tiemulation.ITIVideo;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.awt.image.*;

public class Sprite {

    Image spriteImage ;
    int x ;
    int y ;
    int xvel;
    int yvel ;
    int xtime ;
    int ytime ;

    public Sprite(Image spriteImage, int x, int y, int xvel, int yvel){
        this.spriteImage = spriteImage ;
        this.x = x ;
        this.y = y ;
        this.xvel = xvel ;
        this.yvel = yvel ;

    }

    public Image getSpriteImage() {
        return spriteImage;
    }

    public void setSpriteImage(Image spriteImage) {
        this.spriteImage = spriteImage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXvel() {
        return xvel;
    }

    public void setXvel(int xvel) {
        this.xvel = xvel;
    }

    public int getYvel() {
        return yvel;
    }

    public void setYvel(int yvel) {
        this.yvel = yvel;
    }

    public void display(GraphicsContext gc) {
        //System.out.println("Sprite.display at"+ x+","+y);
        gc.drawImage(spriteImage, x, y);
    }
    public void  move(){
        x += xvel ;
        y += yvel ;
        if (x >= TIVideo.PIXELCOLUMNS)
            x = 0 ;
        if (y >= TIVideo.PIXELROWS)
            y = 0 ;
    }
}
