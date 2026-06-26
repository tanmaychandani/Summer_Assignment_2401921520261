class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        nse[n-1]=n;
        pse[0]=-1;
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.empty() && heights[st.peek()]>=heights[i])st.pop();
            if(st.empty())
            {
                nse[i]=n;
            }
            else
            nse[i]=st.peek();
            st.push(i);
        }
        Stack<Integer>sa=new Stack<>();
        sa.push(0);
        for(int i=1;i<n;i++)
        {
            while(!sa.empty() && heights[sa.peek()]>=heights[i])sa.pop();
            if(sa.empty())
            {
                pse[i]=-1;
            }
            else
            pse[i]=sa.peek();
            sa.push(i);
        }
        int area =0;
        int maxarea=-1;
        for(int i=0;i<n;i++)
        {
            area=heights[i]*(nse[i]-pse[i]-1);
            if(area>maxarea)maxarea=area;
        }
        return maxarea;
    }
}
