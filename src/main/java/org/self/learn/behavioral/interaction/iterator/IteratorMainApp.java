package org.self.learn.behavioral.interaction.iterator;

public class IteratorMainApp {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        PaginationIterator iterator = productService.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
