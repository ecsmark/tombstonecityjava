package com.silvertree.tombstone;

public enum Characters {
    Blank(32),
    Grave(93),
    BottomEdge(95),
    Explode(97),
    ShipRight(104),
    ShipUp(105),
    ShipDown(106),
    ShipLeft(107),
    BulletHorizontal(108),
    BulletVertical(109),
    Large1(112),
    Large2(113),
    SafeAreaBlank(134),
    Small1(144),
    Small2(145),
    SafeAreaColumn(152)

    ;

    int chrIndex ;
    Characters(int value) {
        this.chrIndex =  value ;
    }
    public int getChrIndex(){
        return chrIndex ;
    }
    static public Characters get(int chrIndex){
        return values()[chrIndex];
    }
}
