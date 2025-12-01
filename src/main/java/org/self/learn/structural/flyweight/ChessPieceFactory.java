package org.self.learn.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {
    private static final Map<String,ChessPiece> CACHE = new HashMap<>();


    private static String getIcon(String name,String color){
        name=name.toUpperCase().substring(0,1);
        color = color.toUpperCase().substring(0,1);
        return (name+color);
    }

    public static ChessPiece getPiece(String name,String color){
        String key = name+"-"+color;
        if (!CACHE.containsKey(key)){
            ChessPiece piece = new ChessComponent(name,color,getIcon(name,color));
            CACHE.put(key,piece);
            return piece;
        }
        return CACHE.get(key);
    }
}
