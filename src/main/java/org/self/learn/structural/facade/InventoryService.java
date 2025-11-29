package org.self.learn.structural.facade;

public class InventoryService {
    public boolean isStock(long productId){
        if(productId>20){
            return true;
        }else{
            return false;
        }
    }
}
