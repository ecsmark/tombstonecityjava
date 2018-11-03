package com.silvertree.tombstone.tiemulation;

import com.silvertree.tombstone.Characters;

public interface ITIVideo {
    void refresh() ;
    boolean vmbw(TIAddress addr, char bytes[], short count);
    char vsbr(TIAddress addr);

    void wrChar(int nRow, int nCol, int val);
    void displayAt(int row, int col, int[] value);
    void displayAt(int row, int col, String value);

    byte getChar(int screenLocation);

    void setColor(int charSet, byte color);
    void setChar(int charno, byte[] pattern);

    public void sprite(int spritenum, int pattern, int color, int y, int x,int yvelocity, int xvelocity );
    public void displaySprite(int spriteNum);

    final static int NumRows = 24 ;
    final static int NumColums = 32 ;
}
