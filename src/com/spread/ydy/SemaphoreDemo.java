package com.spread.ydy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    // �Ŷ�������������������
    public static int clientTotal = 10;

    // ��ͬʱ����ҵ��Ĵ���������ͬʱ����ִ�е��߳�����
    public static int threadTotal = 2;

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            final int count = i;
            System.out.println("semaphore init available permits = " + semaphore.availablePermits());
            executorService.execute(() -> {
                try {
                    semaphore.acquire(1);
                    resolve(count);
                    semaphore.release(2);
                    System.out.println("semaphore available permits after acquire = " + semaphore.availablePermits());
//                    semaphore.release(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        System.out.println("���߳�");
        countDownLatch.await();
        System.out.println("ȫ�����");
        executorService.shutdown();
    }

    private static void resolve(int i) throws InterruptedException {
        System.out.println("�����{" + i + "}������ҵ���С�����");
        Thread.sleep(2000);
    }
}
