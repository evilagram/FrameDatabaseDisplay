/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.ChrisWagar;
import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author Chris
 */
public class FileHandle {
    public static ArrayList GetFileData(String pathName){
        ArrayList<Move> moveList = new ArrayList<Move>();
        /*User user1 = new User (1,"McGee","asdf","MyUserName","Password1");
        User user2 = new User (2,"James","Benny","SuperUser","123456789");
        
        moveList.add(user1);
        moveList.add(user2);*/
        
        
        Path filePath = Paths.get(pathName);
        
        String tempLine = "";
        String[] tempSplitLine;
        
        try{
            FileInputStream moveReadFOS = new FileInputStream(pathName);
            BufferedReader moveReadBR = new BufferedReader(new InputStreamReader(moveReadFOS));
            while((tempLine = moveReadBR.readLine()) != null){
                tempSplitLine = tempLine.split("~");
                
                Move newMove = new Move(Integer.parseInt(tempSplitLine[0]),
                        tempSplitLine[1],
                        MoveType.valueOf(tempSplitLine[2]),
                        Integer.parseInt(tempSplitLine[3]),
                        Integer.parseInt(tempSplitLine[4]),
                        Integer.parseInt(tempSplitLine[5]),
                        Integer.parseInt(tempSplitLine[6]),
                        Integer.parseInt(tempSplitLine[7]),
                        Integer.parseInt(tempSplitLine[8]),
                        Boolean.parseBoolean(tempSplitLine[9]),
                        Boolean.parseBoolean(tempSplitLine[10]));
                moveList.add(newMove);
            }
        }catch(Exception ex){}

        return moveList;
    }
    
    public static void SetFileData(String pathName, ArrayList<Move> moveList){
        Path filePath = Paths.get(pathName);
        try{
            Files.delete(filePath);
        }catch(Exception ex){}
        try{
            FileOutputStream moveFileFOS = new FileOutputStream(pathName);
            BufferedWriter MoveFileBW = new BufferedWriter(new OutputStreamWriter(moveFileFOS));
            for(int i = 0;i<moveList.size();i++)
            {
                MoveFileBW.write(moveList.get(i).getMoveID() + "~" +
                        moveList.get(i).getMoveName() + "~" +
                        moveList.get(i).getMoveType() + "~" +
                        moveList.get(i).getStartup() + "~" +
                        moveList.get(i).getActive() + "~" +
                        moveList.get(i).getRecovery() + "~" +
                        moveList.get(i).getHitstun() + "~" +
                        moveList.get(i).getBlockstun() + "~" +
                        moveList.get(i).getDamage() + "~" +
                        moveList.get(i).getSpecialCancel() + "~" +
                        moveList.get(i).getSuperCancel());
                MoveFileBW.newLine();
            }
            MoveFileBW.close();
        }catch(Exception ex){}
    }
}
