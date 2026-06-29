    class Solution {
        public String[] findWords(String[] words) {
            String pat1="qwertyuiop";
            String pat2="asdfghjkl";
            String pat3="zxcvbnm";
            List<String> res = new ArrayList<>();
            for(String word : words){
                String new_word=word.toLowerCase();
                if(pat1.contains(""+new_word.charAt(0))){
                    int i=0;
                    while(i<new_word.length()){
                        if(!pat1.contains(""+new_word.charAt(i)))
                        break;
                        i++;
                    }
                    if(i==new_word.length())
                        res.add(word);

                }
                if(pat2.contains(""+new_word.charAt(0))){
                    int i=0;
                    while(i<new_word.length()){
                        if(!pat2.contains(""+new_word.charAt(i)))
                        break;
                        i++;
                    }
                    if(i==new_word.length())
                        res.add(word);

                }
                if(pat3.contains(""+new_word.charAt(0))){
                    int i=0;
                    while(i<new_word.length()){
                        if(!pat3.contains(""+new_word.charAt(i)))
                        break;
                        i++;
                    }
                    if(i==new_word.length())
                        res.add(word);

                }
            }
        
            return res.toArray((new String[0]));
        }
    }