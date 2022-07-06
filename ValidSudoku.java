class Solution {
    public boolean isValidSudoku(char[][] board) {
        List horizontal_char_list=new ArrayList<String>();
        List vertical_char_list=new ArrayList<String>();
        List square_char_list=new ArrayList<String>();
        int ver_start=0;
        int hor_start=0;
        int ver_end=2;
        int hor_end=2;
        for (int i=0; i< board.length;i++)
        {
            for (int j=0 ; j < board[i].length; j++)
            {
                int ch=Character.getNumericValue(board[i][j]);
                if(ch < 10 && ch >0)
                {
                    if(horizontal_char_list.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        horizontal_char_list.add(board[i][j]);
                    }
                }
                // else
                // {
                //     return false;
                // }
            }
            for (int k=0;k< 9; k++)
            {
                int ch=Character.getNumericValue(board[k][i]);
                if(ch < 10 && ch >0)
                {
                    if(vertical_char_list.contains(board[k][i]))
                    {
                        return false;
                    }
                    else
                    {
                        vertical_char_list.add(board[k][i]);
                    }
                }
                // else
                // {
                //     return false;
                // }
            }
             for (int x=ver_start; x <= ver_end;x++)
             {
                 for(int y=hor_start;y<=hor_end;y++)
                 {
                     int ch=Character.getNumericValue(board[x][y]);
                     if(ch < 10 && ch >0)
                     {
                        if(square_char_list.contains(board[x][y]))
                        {
                            return false;
                        }
                        else
                        {
                            square_char_list.add(board[x][y]);
                        }
                    }
                    // else
                    // {
                    //     return false;
                    // }
                 }
            }
            
           
            if(i==2 || i==5)
            {
               hor_start=0;
                hor_end=2; 
                ver_start=ver_end+1;
                ver_end=ver_end+3;
            }
            else
             {
                hor_start=hor_end+1;
                hor_end=hor_end+3;
            }
         horizontal_char_list=new ArrayList<String>();
         vertical_char_list=new ArrayList<String>();
         square_char_list=new ArrayList<String>();
            
        }
        
        return true;
        
    }
    
}
