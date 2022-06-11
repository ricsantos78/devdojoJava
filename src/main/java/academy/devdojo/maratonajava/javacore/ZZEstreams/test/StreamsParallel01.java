package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
* Atençao a para usar o Parallel
* Benchmark
* Unboxing | boxing (Pode afetar por conta se esta usando Wrappers ou não)
* Muito ruins de usar o Parallel(limit, findFirst)
* bom (FindAny)
* Custo total da computacao E, P.
* Quantidade de dados
* Tipos de coleções
* Tamanho do Stream (Tamanho definido são melhores)
* Processamento merge
* */

public class StreamsParallel01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i+1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
