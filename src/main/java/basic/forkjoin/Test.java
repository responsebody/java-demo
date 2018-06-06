package basic.forkjoin;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Test {
    @org.junit.Test
    public void forkJoinTest() throws ExecutionException, InterruptedException {
        int arr[] = new int[100];
        Random random = new Random();
        int total = 0;
        // 初始化100个数字元素
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(100);
            // 对数组元素赋值,并将数组元素的值添加到total总和中
            total += (arr[i] = temp);
        }
        System.out.println("初始化时的总和=" + total);
        // 创建包含Runtime.getRuntime().availableProcessors()返回值作为个数的并行线程的ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        // 提交可分解的PrintTask任务
        Future<Integer> future = forkJoinPool.submit(new ForkJoinTaskTest(arr, 0,
                arr.length));
        System.out.println("计算出来的总和=" + future.get());
        // 关闭线程池
        forkJoinPool.shutdown();
    }
}
