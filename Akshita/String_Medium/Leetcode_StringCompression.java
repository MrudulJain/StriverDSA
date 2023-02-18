package String_Medium;

public class Leetcode_StringCompression {
    public int compress(char[] chars) {
        int n= chars.length;
        StringBuffer s= new StringBuffer();
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                count++;
            }
            else if(chars[i]!=chars[i+1] && count==1)
            {
                s.append(chars[i]);
            }
            else if(chars[i]!=chars[i+1] && count>1)
            {
                s.append(chars[i]);
                s.append(count);
                count=1;
            }
        }
        if(count>1)
        {
            s.append(chars[n-1]);
            s.append(count);
        }
        else
        {
            s.append(chars[n-1]);
        }
        int m=s.length();
        s.toString();
        for(int i=0;i<m;i++)
        {
            chars[i]=s.charAt(i);
        }
        return m;
    }
}
