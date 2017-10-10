/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.ChrisWagar;

/**
 *
 * @author Chris
 */
public class Move {
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
    Move(int moveID, String moveName, MoveType typeMove, int startup, int active, int recovery, int hitstun, int blockstun, int damage, boolean specialCancel, boolean superCancel){
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
    
    private void CalcFrameAdvantage(){
        FrameAdvantage = Hitstun - (Active + Recovery);
        BlockAdvantage = Blockstun - (Active + Recovery);
    }
    
    public void setMoveID(int moveID){
        MoveID = moveID;
    }
    public int getMoveID(){
        return MoveID;
    }
    public void setMoveName(String moveName){
        MoveName = moveName;
    }
    public String getMoveName(){
        return MoveName;
    }
    public void setMoveType(MoveType typeMove){
        MType = typeMove;
    }
    public MoveType getMoveType(){
        return MType;
    }
    public void setStartup(int startup){
        Startup = startup;
    }
    public int getStartup(){
        return Startup;
    }
    public void setActive(int active){
        Active = active;
        CalcFrameAdvantage();
    }
    public int getActive(){
        return Active;
    }
    public void setRecovery(int recovery){
        Recovery = recovery;
        CalcFrameAdvantage();
    }
    public int getRecovery(){
        return Recovery;
    }
    public void setHitstun(int hitstun){
        Hitstun = hitstun;
        CalcFrameAdvantage();
    }
    public int getHitstun(){
        return Hitstun;
    }
    public void setBlockstun(int blockstun){
        Blockstun = blockstun;
        CalcFrameAdvantage();
    }
    public int getBlockstun(){
        return Blockstun;
    }
    public void setDamage(int damage){
        Damage = damage;
    }
    public int getDamage(){
        return Damage;
    }
    public void setSpecialCancel(boolean specialCancel){
        SpecialCancel = specialCancel;
    }
    public boolean getSpecialCancel(){
        return SpecialCancel;
    }
    public void setSuperCancel(boolean superCancel){
        SuperCancel = superCancel;
    }
    public boolean getSuperCancel(){
        return SuperCancel;
    }
}
