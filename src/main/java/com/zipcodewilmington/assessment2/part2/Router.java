package com.zipcodewilmington.assessment2.part2;

import java.util.Set;
import java.util.TreeMap;

public class Router {
    TreeMap<String, String> router = new TreeMap<>();

    public void add(String path, String controller) {
        router.put(path, controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
            return router.get(path);
    }

    public void update(String path, String studentController) {
        router.put(path, studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }

    @Override
    public String toString(){
        String returnString = "";
        Set<String> keys = router.keySet();
        for (String key : keys){
            returnString += key + " -> " + router.get(key) + "\n";
        }
        return returnString;
    }
}
