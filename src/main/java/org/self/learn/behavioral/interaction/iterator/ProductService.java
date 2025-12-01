package org.self.learn.behavioral.interaction.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements APIResponse{
    @Override
    public PaginationIterator createIterator() {
        return new ProductPaginationIter();
    }

    //Simulate backend API
    private List<Product> fetchPage(int pageNumber, int pageSize){
        //Assume 25 products -> 3pages
        int totalProducts = 25;
        int start = (pageNumber-1)*pageNumber;
        int end = Math.min(start+pageSize,totalProducts);
        //No More Product
        if(start>=totalProducts) return new ArrayList<>();

        List<Product> page = new ArrayList<>();
        for (int i = start;i<end;i++){
            page.add(new Product("Product "+(i+1)));
        }
        return page;

    }

    private class ProductPaginationIter implements PaginationIterator{

        private final int pageSize =10;
        private int currPage = 1;
        private List<Product> currentBatch = fetchPage(currPage,pageSize);
        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index<currentBatch.size()){
                return true;
            }
            //Load Next Page
            currPage++;
            currentBatch = fetchPage(currPage,pageSize);
            return !currentBatch.isEmpty();
        }

        @Override
        public Product next() {
            if (!hasNext()){
                throw new RuntimeException("No more product");
            }
            return currentBatch.get(index++);
        }
    }
}
