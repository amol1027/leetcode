class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] res = title.split(" ");
       for(String str: res){
        if(str.length()<=2){
            sb.append(str.toLowerCase()).append(" ");
        }
        else{
            str = str.toLowerCase();
            char ch = Character.toUpperCase(str.charAt(0));
            str = ch + str.substring(1);
            sb.append(str).append(" ");
        }
       }
       return sb.toString().trim();
    }
}