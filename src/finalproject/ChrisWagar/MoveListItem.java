/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.ChrisWagar;

/**
 * Easier to make this class and to swap it out than to risk modifying ListItem.java
 * @author Chris
 */
public class MoveListItem {
    protected int MoveID;
    protected String MoveName;
    protected MoveType MType;
    protected int Startup;
    protected int Active;
    protected int Recovery;
    protected int Hitstun;
    protected int Blockstun;
    protected int FrameAdvantage;//not sure if I need these two, since they're derived properties
    protected int BlockAdvantage;//not sure if I need these two, since they're derived properties
    protected int Damage;
    protected boolean SpecialCancel;
    protected boolean SuperCancel;
    MoveListItem(int moveID, String moveName, MoveType typeMove, int startup, int active, int recovery, int hitstun, int blockstun, int damage, boolean specialCancel, boolean superCancel){
        MoveID = moveID;
        MoveName = moveName;
        MType = typeMove;
        Startup = startup;
        Active = active;
        Recovery = recovery;
        Hitstun = hitstun;
        Blockstun = blockstun;
        FrameAdvantage = hitstun - (active + recovery);
        BlockAdvantage = blockstun - (active + recovery);
        Damage = damage;
        SpecialCancel = specialCancel;
        SuperCancel = superCancel;
    }
    public String toString(){
        return MoveName;
    }
}
