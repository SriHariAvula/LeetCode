class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> ana = new HashMap<>();
        int windowStart=0, matches = 0;
        for(int i=0; i<p.length(); i++){
            ana.put(p.charAt(i), ana.getOrDefault(p.charAt(i), 0)+1);
        }
        List<Integer> li = new ArrayList<>();
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char rc = s.charAt(windowEnd);
            if(ana.containsKey(rc)){
                ana.put(rc, ana.get(rc)-1);
                if(ana.get(rc)==0){
                    matches++;
                }
            }
            if(matches==ana.size()){
                li.add(windowStart);
            }
            if(windowEnd>=p.length()-1){
                char lc = s.charAt(windowStart);
                windowStart++;
                if(ana.containsKey(lc)){
                    if(ana.get(lc)==0){
                        matches--;
                    }
                    ana.put(lc, ana.get(lc)+1);
                }
            }
        }
        return li;
    }
}