package Maps_Set_Map;

import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> amap = new HashMap<>();
        for(int ele:a){
            if(amap.containsKey(ele)){
                int freq=amap.get(ele);
                amap.put(ele,freq+1);
            }
        else amap.put(ele,1);
        }
        HashMap<Integer, Integer> bmap = new HashMap<>();

        for(int ele:b){
            if(!amap.containsKey(ele) )return false;
            if(bmap.containsKey(ele)){
                int freq=bmap.get(ele);
                bmap.put(ele,freq+1);
            }
            else bmap.put(ele,1);
        }
        for(int ele:bmap.keySet()) {
int freq=bmap.get(ele);
int afreq=amap.get(ele);
if(afreq<freq)  return false;
        }
        return true;
    }
}
