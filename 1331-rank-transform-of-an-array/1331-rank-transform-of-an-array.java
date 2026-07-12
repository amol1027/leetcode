class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, List<Integer>> ranks = new TreeMap<>();
        for(int i=0; i<arr.length; i++){
            if(!ranks.containsKey(arr[i])){
                ranks.put(arr[i],new ArrayList<>());
            }
            ranks.get(arr[i]).add(i);
        }
        int rank =1;
        for(int i: ranks.keySet()){
            for(int index: ranks.get(i)){
                arr[index]= rank;
            }
            rank++;
        }
        return arr;
    }
}