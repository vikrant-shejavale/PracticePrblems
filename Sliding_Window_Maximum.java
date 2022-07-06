class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      
               
       int[] temp= new int[nums.length-k+1];
        int startIndex = 0;     
        if( k==1)
            return nums ;  
        int l=nums.length ;
        int m =nums[0];        
        int i;
        int maxIndex=0;
        
         for (i= 1; i < k; i++)
            {
                  if (m < nums[i])
                  {
                        
                      m = nums[i];                      
                      maxIndex=i;
                  }                
            }
        temp[startIndex]=m;
        startIndex++;
        for (;i<l;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                maxIndex=i;
                
            }
            else if(i-k == maxIndex)
            {
                
                m=nums[i];
                maxIndex=i;
                for(int x= i-k+1; x <i ;x++)
                {
                    if (m < nums[x])
                    {
                        m=nums[x];
                        maxIndex=x;
                    }
                }
                
            }
             
            temp[startIndex]=m;
            startIndex++;
        }
        
        return temp ;
    
        }
    }
