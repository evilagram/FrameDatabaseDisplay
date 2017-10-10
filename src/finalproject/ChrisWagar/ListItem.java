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
public class ListItem {
    protected int UserID;
    protected String UserName;
    protected String UserLName;
    protected String UserFName;
    protected String UserUID;
    protected String UserPWD;
    
    ListItem(int userID, String userLName, String userFName, String userUID, String userPWD){
        UserID=userID;
        UserLName=userLName;
        UserFName=userFName;
        UserUID=userUID;
        UserPWD=userPWD;
        UserName = userLName + ", " + userFName;
    }
    public String toString(){
        return UserName;
    }
}
