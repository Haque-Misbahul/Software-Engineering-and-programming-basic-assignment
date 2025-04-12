
package assignment5;

public class Stemmer {
    public static String[] getNGrams(String string, int length){
        int size = string.length();
        int arrlen = 1;
        if(length<=size)
        {
            arrlen = 1 + ( size - length);
        }
        String[] answer = new String[arrlen];
        if(length<=size)
        {
            int index=0;
            for(int i = 0; i<=size-length; i++ )
            {
                String S = "";
                for(int j = i; j<i+length; j++) 
                {
                    S = S + string.charAt(j);
                }
                answer[index] = S;
                index++;
            }
        }
        if(length> size)
        {
             int character = length - size;
             for(int i = 0; i<character; i++)
             {
                 string = string + '*';
             }
             answer[0] = string;
        }
        return answer;
    }
    public static String[] getShared(String[] firstStr, String[] secondStr)
    {
        int size = 0; 
        for(int i =0 ; i<firstStr.length; i++)
        {
            for(int j = 0; j<secondStr.length; j++)
            {
                if(firstStr[i].equals(secondStr[j]))
                {
                    size++;
                    break;
                }              
            }
        }
        String[] answer = new String[size];
        int Index = 0;
        for(int i =0 ; i<firstStr.length; i++)
        {
            for(int j = 0; j<secondStr.length; j++)
            {
                if(firstStr[i].equals(secondStr[j]))
                {
                    answer[Index] = firstStr[i];
                    Index++;
                    break;
                }            
            }
        }
        return answer;
    }
    public static float getDistance(String[] firstStr, String[] secondStr)
    {
        float total = firstStr.length + secondStr.length;
        String[] shared = getShared(firstStr, secondStr);
        float answer =  shared.length / total;
        return answer;
    }
    public static boolean isRelevant(String keyword, String text)
    {
        int size = 1; 
        for(int i = 0; i<text.length(); i++)
        {
            if(text.charAt(i)==' ')
            {
                size++;
            }
        }
        String[] words =  new String[size];
        String word = "";
        int Index = 0; 
        for(int i = 0; i<text.length(); i++)
        {
            if(text.charAt(i)!=' ')
            {
                word = word + text.charAt(i);
            }
            else
            {
                words[Index] = word;
                Index++;
                word = "";
            }
        }
        words[Index] = word;
        boolean answer = false;
        for(int i = 0; i<size; i++)
        {
            String[] keywordNGrams = getNGrams(keyword, 3);
            String[] wordNGrams = getNGrams(words[i], 3);
            float  result = getDistance(keywordNGrams, wordNGrams);
            if(result >= 0.4)
            {
                 answer = true;
            }                    
        }
        return answer;
    }
    public static void main(String[] args)
    {
        String[] houseNgrams = getNGrams("house", 3);
        for(int i = 0; i<houseNgrams.length; i++)
        {
            System.out.println(houseNgrams[i]);
        }
        
        String[] trousersNGrams = getNGrams("trousers",3);
        System.out.println();
        for(int i = 0; i<trousersNGrams.length; i++)
        {
            System.out.println(trousersNGrams[i]);
        }
        
        String[] getshared = getShared(houseNgrams, trousersNGrams);
        System.out.println();
        for(int i = 0; i< getshared.length; i++)
        {
            System.out.println(getshared[i]);
        }
        float result = getDistance(houseNgrams, trousersNGrams);
        System.out.println(result);
        
        boolean  IsRelevant = isRelevant("house", "the house is clean");
        System.out.println(IsRelevant);
        IsRelevant = isRelevant("house", "trousers");
        System.out.println(IsRelevant);

    }
}

