package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class ListUtility {
    ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> returnList = new ArrayList<>();
        for(Integer integer : list){
            if (!returnList.contains(integer)){
                returnList.add(integer);
            }
        }
        return returnList;
    }

    public String join() {
        String returnString = "" + list.get(0);
        for (int i = 1; i < list.size(); i++) {
            returnString += ", " + list.get(i);
        }
        return returnString;
    }

    public Integer mostCommon() {
        Integer[] array = new Integer[list.size()];
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(list.toArray(array));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
