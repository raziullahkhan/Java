
package MyPractice;


public class MyCalci {
    public static void main(String[] args) {
         String st="-23+25";
         String [] str=new String[st.length()];
         int n=0;
         int l=0;
    
        for(int i=0;i<st.length();i++){
            if((st.charAt(i)=='-'||st.charAt(i)=='+')&&i==0){//
                
            }
            else if(st.charAt(i)=='+'||st.charAt(i)=='-'||st.charAt(i)=='*'||st.charAt(i)=='/'){
                String tv="";
                for(;n<i;n++){
                    tv=tv+String.valueOf(st.charAt(n));
                }
                    str[l++]=tv;
                    str[l++]=String.valueOf(st.charAt(i));
                    n++;
                
            }
            else if(i==st.length()-1){
                String tv="";
                for(;n<=i;n++){
                    tv=tv+String.valueOf(st.charAt(n));
                }
                str[l++]=tv;
                n++;
            }
        }
        
        double d=0;
        int size=str.length;
        int z=0;
        for(int i=0;i<size;i++){
            if(str[i]!=null){
            if(str[i].charAt(0)=='*'){
                d=Double.parseDouble(str[i-1])*Double.parseDouble(str[i+1]);
                str[i-1]=String.valueOf(d);
                for(z=i;z<size-2;z++){
                    str[z]=str[z+2];
                }
                size=size-2;
                i=-1;
            }
            else if(str[i].charAt(0)=='/'){
                d=Double.parseDouble(str[i-1])/Double.parseDouble(str[i+1]);
                str[i-1]=String.valueOf(d);
                for(z=i;z<size-2;z++){
                    str[z]=str[z+2];
                }
                size=size-2;
                i=-1;
            }
            }
        }
         
        d=0;
        
        z=0;
        for(int i=0;i<size;i++){
            if(str[i]!=null){
            if(str[i].charAt(0)=='+'&&str[i].length()==1){//
                d=Double.parseDouble(str[i-1])+Double.parseDouble(str[i+1]);
                str[i-1]=String.valueOf(d);
                for(z=i;z<size-2;z++){
                    str[z]=str[z+2];
                }
                size=size-2;
                i=-1;
            }
            else if(str[i].charAt(0)=='-'&&str[i].length()==1){
                //System.out.println(Double.parseDouble("-(-4.8)"));
                d=Double.parseDouble(str[i-1])-(Double.parseDouble(str[i+1]));
                str[i-1]=String.valueOf(d);
                for(z=i;z<size-2;z++){
                    str[z]=str[z+2];
                }
                size=size-2;
                i=-1;
            }
            }
        }
        System.out.println(str[0]);
         
    }
}
