package month_8.week_1;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.LongStream;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicLong k = new AtomicLong(Long.MIN_VALUE);
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        ForkJoinPool pool = new ForkJoinPool(1000);
        pool.submit(() -> {
            LongStream.range(Long.MIN_VALUE, Long.MAX_VALUE).parallel().forEach( i -> {
                String uuid = UUID.randomUUID().toString();
                k.incrementAndGet();

                if (map.getOrDefault(uuid, 0) > 1) return;
                map.put(uuid, map.getOrDefault(uuid, 0) + 1);
            });

        }).get();

        System.out.println(k.get());
        map.entrySet().forEach(kv -> {
            if (kv.getValue() > 1) {
                System.out.println("key = " + kv.getKey() + " , value =" + kv.getValue());
            }
        });
    }
}
