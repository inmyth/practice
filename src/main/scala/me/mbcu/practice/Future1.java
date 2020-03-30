package me.mbcu.practice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future1  {


    public static void main(String[] args) {

        ExecutorService executorService =  Executors.newSingleThreadExecutor();
        CompletableFuture<Void> res = get(1).thenCompose(id -> save(id));

        CompletableFuture.allOf(get(1), save("a"));

    }


    public static CompletableFuture<String> get(int any){
        return CompletableFuture.supplyAsync(() -> "Hello future!",  Executors.newSingleThreadExecutor());
    }

    public static CompletableFuture<Void> save(String id){
        return CompletableFuture.supplyAsync(() ->  null);
    }



}
