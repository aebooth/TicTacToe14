/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author alex
 */
public class Board {
    private Letter[] grid;
    
    public Board(){
        this.grid = new Letter[9];
    }
    
    public int getFlattened()
    {
        int result = 0;
        for(int i = 0; i < this.grid.length; i++){
            result += Math.pow(2,i)*grid[i].value();
        }
        return result;
    }
    
    /*
    Rows start from the top and columns start from the left.  The numbers are 1-based
    meaning 1,2,3 instead of 0,1,2
    */
    public boolean tryRecordMove(Letter current, int row, int col){
        int index = (row-1)*3 + col;
        if(this.grid[index] == null && (row <= 3 && row > 0) && (col <= 3 && col > 0)){
            this.grid[index] = current;
            return true;
        }
        else return false;
    }
    
    
    
    public Letter[] getRow(int row){
        Letter[] res = new Letter[3];
        for(int i = 0; i < res.length; i++){
            res[i] = grid[i+(row-1)*3];
        }
        return res;
    }
    
    public Letter[] getCol(int col){
        Letter[] res = new Letter[3];
        for(int i = 0; i < res.length; i++){
            res[i] = grid[i*(col-1)];
        }
        return res;
    }
}
