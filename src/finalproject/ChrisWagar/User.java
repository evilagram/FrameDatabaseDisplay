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
public class User {
    protected int UserID;
    protected String UserLName;
    protected String UserFName;
    protected String UserUID;
    protected String UserPWD;
    
    User(int userID, String userLName, String userFName, String userUID, String userPWD){
        UserID=userID;
        UserLName=userLName;
        UserFName=userFName;
        UserUID=userUID;
        UserPWD=userPWD;
    }
    public void setUserID(int userID){
        UserID = userID;
    }
    public int getUserID(){
        return UserID;
    }
    public void setUserFName(String userFName){
        UserFName = userFName;
    }
    public String getUserFName(){
        return UserFName;
    }
    public void setUserLName(String userLName){
        UserFName = userLName;
    }
    public String getUserLName(){
        return UserLName;
    }
    public void setUserUID(String userUID){
        UserUID = userUID;
    }
    public String getUserUID(){
        return UserUID;
    }
    public void setUserPWD(String userPWD){
        UserPWD = userPWD;
    }
    public String getUserPWD(){
        return UserPWD;
    }
}
