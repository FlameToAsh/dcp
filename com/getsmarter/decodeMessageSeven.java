package com.getsmarter;

public class decodeMessageSeven {
    public int decode(String message) {
        char[] ch = message.toCharArray();
        int count = 1,letter = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<ch.length-2;i++){
            for(int j = 1;j<ch.length-1;j++){
                str.append(ch[i]);
                str.append(ch[j]);
                letter = Integer.parseInt(str.toString());
                if (letter>26){
                    str.delete(0, str.capacity());
                    i++;
                    continue;
                } else if (letter<=26){
                    count++;
                }
            }
        }
        return count;
    }
}
