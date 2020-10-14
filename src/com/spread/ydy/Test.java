package com.spread.ydy;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test<E> {

    public static void main(String[] args) {

        // BinaryTree bt = new BinaryTree();
        // int[] a = { 6, 4, 2, 1, 3, 5, 10, 8, 7, 9, 11 };

        // for (int i = 0; i < a.length; i++) {
        // Utils.buildTree(bt, bt.getRoot(), a[i]);
        // }
        // Utils.preOrderCru(bt.getRoot());
        // System.out.println();
        // System.out.println(Utils.preOrderNormal(bt.getRoot()));
        // System.out.println();
        //
        // Utils.inOrderCru(bt.getRoot());
        // System.out.println();
        // System.out.println(Utils.inOrderNormal(bt.getRoot()));
        // System.out.println();
        // System.out.println();
        //
        // Utils.postOrderCru(bt.getRoot());
        // System.out.println();
        // System.out.println(Utils.postOrderNormal(bt.getRoot()));
        // System.out.println();
        // System.out.println(BinaryTree.inOrderNormal(bt.getRoot()));
        // System.out.println();
        // BinaryTree.postOrderCru(bt.getRoot());
        // System.out.println();
        // System.out.println(BinaryTree.postOrderNormal(bt.getRoot()));

        // int[] a = { 6, 4, 2, 1, 3, 5, 10, 8, 7, 9, 11 };
        // int k = 5;
        // if (k > a.length) return;
        // int[] b = Arrays.copyOf(a, k);
        // for (int i = 0; i < k; i++) {
        // for (int j = i; j < b.length; j++) {
        //
        // }
        // }

        // File file = new File("C:\\Users\\devin.yin\\Desktop\\largeT.txt");
        // System.out.println(file.exists());

        // System.out.println((0+15)/2);
        // System.out.println(1+2+"3");
        // System.out.println('b');
        // System.out.println('b' + 'c');
        // System.out.println((char)('a'+4));

        // long sum = 0;
        // long start = System.currentTimeMillis();
        // for (int i = 0; i < 100000; i++) {
        // for (int j = 0; j < 100000; j++) {
        // sum++;
        // }
        // }
        // long end = System.currentTimeMillis();
        // System.out.println(sum);
        // System.out.println((end - start));

        // 1.1.12 start
        // int[] a = new int[10];
        // for (int i = 0; i < 10; i++) {
        // a[i] = 9-i;
        // System.out.print(a[i]);
        // }
        // System.out.println();
        // System.out.println("===================");
        // for (int i = 0; i < 10; i++) {
        // a[i] = a[a[i]];
        // System.out.print(a[i]);
        // }
        // System.out.println();
        // System.out.println("===================");
        // for (int i = 0; i < 10; i++) {
        // System.out.print(a[i]);
        // }
        // 1.1.12 end

        // 1.1.11 start
        // boolean[][] a = new boolean[10][10];
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // a[i][j] = new Random().nextBoolean();
        // }
        // }

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // if (a[i][j]) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println("=================");
        // 1.1.11 end

        // 1.1.13 start
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // if (a[j][i]) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // 1.1.13 end

        // 1.1.14 start
        // System.out.println(lg(0));
        // System.out.println(lg(1));
        // System.out.println(lg(2));
        // System.out.println(lg(3));
        // System.out.println(lg(4));
        // System.out.println(lg(5));
        // System.out.println(lg(6));
        // System.out.println(lg(7));
        // System.out.println(lg(8));
        // System.out.println(lg(9));
        // System.out.println(lg(10));
        // 1.1.14 end

        // 1.1.18 start
        // System.out.println(mystery(3, 1));
        // 1.1.18 end

        // 1.1.19 start
        // for(int i = 2; i < 100000; i++) {
        // long a[] = new long[i];
        // fibonacci(a);
        // }
        // 1.1.19 end

//        double xlo = Double.parseDouble(args[0]);
//        double xhi = Double.parseDouble(args[1]);
//        double ylo = Double.parseDouble(args[2]);
//        double yhi = Double.parseDouble(args[3]);
//
//        int T = Integer.parseInt(args[4]);
//
//        Interval1D xinterval = new Interval1D(xlo, xhi);
//        Interval1D yinterval = new Interval1D(ylo, yhi);
//        Interval2D box = new Interval2D(xinterval, yinterval);
//        box.draw();
//
//        Counter c = new Counter("hits");
//
//        for (int t = 0; t < T; t++) {
//            double x = Math.random();
//            double y = Math.random();
//            Point2D p = new Point2D(x, y);
//            if (box.contains(p))
//                c.increment();
//            else
//                p.draw();
//        }

//        String title = " 涓板瘜鐨�";
//        title = title.trim();
//        for (int i = 0; i < title.length(); i++) {
//            System.out.println(title.charAt(i));
//        }
//        System.out.println(cnToUnicode(title));
//        ReversibleArrayList<String> ra = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
//        for (String s : ra.reversed()) {
//            System.out.println(s);
//        }
//        File[] files = new File(".").listFiles();
//        for (File file : files) {
//            System.out.println(file.getPath());
//        }
//        System.out.println("Start");
//        printMemory();
//        method();
//        System.gc();
//        System.out.println("2nd gc finished");
//        printMemory();

//        long mills = 1588069421514L;
//        Date date = new Date(1588069421514L);
//        System.out.println(date);

//        Object referent = new Object();
//        WeakReference<Object> weakRerference = new WeakReference<Object>(referent);
//        assertSame(referent, weakRerference.get());
//        System.out.println(weakRerference.get());
//        referent = null;
//        System.gc();
//        System.out.println(weakRerference.get());
//        Object referent = new Object();
//        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
//        WeakReference<Object> weakReference = new WeakReference<Object>(referent, referenceQueue);
//
//        System.out.println(weakReference.isEnqueued());
//        Reference<? extends Object> polled = referenceQueue.poll();
//        assertNull(polled);
//
//        referent = null;
//        System.gc();
//
//        System.out.println(weakReference.isEnqueued());
//        Reference<? extends Object> removed;
//        try {
//            removed = referenceQueue.remove();
//            System.out.println(removed);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        System.out.println("strongReference-------------------------------");
//        strongReference();
//        System.out.println();
//        System.out.println("weakReference-------------------------------");
//        weakReference();
//        System.out.println();
//        System.out.println("weakHashMap-------------------------------");
//        try {
//            weakHashMap();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        System.out.println();
//        System.out.println("softReference-------------------------------");
//        softReference();
//        System.out.println();
//        System.out.println("phantomReferenceAlwaysNull-------------------------------");
//        phantomReferenceAlwaysNull();
//        System.out.println();
//        System.out.println("referenceQueue-------------------------------");
//        try {
//            referenceQueue();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        phantomReference();
//        new Thread(() -> test(1), "Thread A").start();
//        new Thread(() -> test(1), "Thread B").start();
//        new Thread(() -> test(2), "Thread A").start();
//        new Thread(() -> test(2), "Thread B").start();
//        new Thread(() -> test(2), "Thread C").start();
//        new Thread(() -> test(2), "Thread D").start();
//        new Thread(() -> test(2), "Thread E").start();
//        Thread thread = new Thread(new ThreadDemo(lock, lock1));
//        Thread thread1 = new Thread(new ThreadDemo(lock1, lock));
//        thread.start();
//        thread1.start();
//        thread.interrupt();
//        long f = 1000;
//        System.out.println((float) f/1000);
//        System.out.println((float) (f/1000));
//        System.out.println(roundStorageSize(10000));
        int a = 0;
        setValue(a);
        System.out.println(a);
    }

    private static final Lock lock = new ReentrantLock();
    private static final Lock lock1 = new ReentrantLock(true);
    public static int setValue(int a) {
        a += 1;
        return a;
    }

    public static long roundStorageSize(long size) {
        long val = 1;
        long pow = 1;
        while ((val * pow) < size) {
            val <<= 1;
            if (val > 512) {
                val = 1;
                pow *= 1000;
            }
        }
        return val * pow;
    }

    public static void test(int choice) {
        if (1 == choice) {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " get lock");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " release lock");
                lock.unlock();
            }
        } else if (2 == choice) {
            for (int i = 0; i < 2; i++) {
                try {
                    lock1.lock();
                    System.out.println(Thread.currentThread().getName() + " get lock");
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " release lock");
                    lock1.unlock();
                }
            }
        }
    }

    static class ThreadDemo implements Runnable {
        Lock firstLock;
        Lock secondLock;

        public ThreadDemo(Lock firstLock, Lock secondLock) {
            super();
            this.firstLock = firstLock;
            this.secondLock = secondLock;
        }



        @Override
        public void run() {
            try {
                firstLock.lockInterruptibly();
                TimeUnit.MILLISECONDS.sleep(50);
                secondLock.lockInterruptibly();
            } catch (Exception e) {
                // TODO: handle exception
            } finally {
                firstLock.unlock();
                secondLock.unlock();
                System.out.println(Thread.currentThread().getName() + " get resource, end normally!");
            }

        }

    }

    public static void strongReference() {
        Object referent = new Object();
        Object strongReference = referent;

        System.out.println(strongReference);

        referent = null;
        System.gc();

        System.out.println(strongReference);
    }

    public static void weakReference() {
        Object referent = new Object();
        WeakReference<Object> weakRerference = new WeakReference<Object>(referent);

        System.out.println(weakRerference.get());
        referent = null;
        System.gc();
        System.out.println(weakRerference.get());
    }

    public static void weakHashMap() throws InterruptedException {
        Map<Object, Object> weakHashMap = new WeakHashMap<Object, Object>();
        Object key = new Object();
        Object value = new Object();
        weakHashMap.put(key, value);

        System.out.println(weakHashMap.containsValue(value));
        key = null;
        System.gc();

        Thread.sleep(1000);

        System.out.println(weakHashMap.containsValue(value));
    }

    public static void softReference() {
        Object referent = new Object();
        SoftReference<Object> softRerference = new SoftReference<Object>(referent);

        System.out.println(softRerference.get());
        referent = null;
        System.gc();

        System.out.println(softRerference.get());
    }

    public static void phantomReferenceAlwaysNull() {
        Object referent = new Object();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(referent,
                new ReferenceQueue<Object>());
        System.out.println(phantomReference.get());
    }

    public static void phantomReference() {
        ReferenceQueue<String> refQueue = new ReferenceQueue<String>();
        PhantomReference<String> referent = new PhantomReference<String>(new String("T"), refQueue);
        System.out.println(referent.get());// null

        System.gc();
        System.runFinalization();
        System.out.println(refQueue.poll()); //true 

        System.out.println(refQueue.poll() == referent); // true
    }

    public static void referenceQueue() throws InterruptedException {
        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        WeakReference<Object> weakReference = new WeakReference<Object>(referent, referenceQueue);

        System.out.println(weakReference.isEnqueued());
        Reference<? extends Object> polled = referenceQueue.poll();
        System.out.println(polled);

        referent = null;
        System.gc();

        System.out.println(weakReference.isEnqueued());
        Reference<? extends Object> removed = referenceQueue.remove();
        System.out.println(removed);
    }

    private int _10MB = 10*1024*1024;
    private byte[] memory = new byte[8*_10MB];

    public static void method() {
        Test g = new Test();
        System.gc();
        System.out.println("1st gc finished");
        printMemory();
    }

    public static void printMemory() {
        System.out.print("free is " + Runtime.getRuntime().freeMemory()/1024/1024 + "M, ");
        System.out.println("total is " + Runtime.getRuntime().totalMemory()/1024/1024 + "M");
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 10);
        }
        return returnStr;
    }

    public static void fibonacci(long[] a) {
        int N = a.length;
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < N; i++)
            a[i] = a[i - 1] + a[i - 2];
        System.out.println(a[N - 1]);
        return;
    }

    public static int mystery(int a, int b) {// 绁炵鐨勫嚱鏁帮紝鍏跺疄灏辨槸add(a,b)鍑芥暟锛�
        if (b == 0)
            return 0; // 鑷充簬棰樻剰涓鐨勫皢浠ｇ爜涓�+鎹㈡垚*锛宺eturn 0鎹㈡垚return 1锛屽苟娌＄湅鍑烘潵鍟ユ晥鏋�
        if (b % 2 == 0)
            return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int lg(int n) {
        int result = 0;
        if (n < 1) {
            result = 0;
        } else if (n < 3) {
            result = 1;
        } else {
            for (int i = 0; i < n; i++) {
                if ((result * result) > n) {
                    return result - 1;
                }
                result++;
            }
        }
        return result;
    }
}

class Utils {
    public static void buildTree(BinaryTree bt, TreeNode root, int data) {
        TreeNode tnInsert = new TreeNode(data);
        if (bt.getRoot() == null) {
            bt.setRoot(tnInsert);
        } else {
            if (data < root.getValue()) {
                if (root.getLeft() == null) {
                    root.setLeft(tnInsert);
                } else {
                    buildTree(bt, root.getLeft(), data);
                }
            } else {
                if (root.getRight() == null) {
                    root.setRight(tnInsert);
                } else {
                    buildTree(bt, root.getRight(), data);
                }
            }
        }
    }

    public static void preOrderCru(TreeNode root) {
        if (null == root)
            return;
        visit(root);
        preOrderCru(root.getLeft());
        preOrderCru(root.getRight());
    }

    public static List<Integer> preOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return results;
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root != null) {
                results.add(root.getValue());
                stack.push(root.getRight());
                stack.push(root.getLeft());
            }
        }
        return results;
    }

    public static void inOrderCru(TreeNode root) {
        if (null == root)
            return;
        inOrderCru(root.getLeft());
        visit(root);
        inOrderCru(root.getRight());
    }

    public static List<Integer> inOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode tn = root;
        while (tn != null || !stack.isEmpty()) {
            while (tn != null) {
                stack.push(tn);
                tn = tn.getLeft();
            }
            tn = stack.pop();
            results.add(tn.getValue());
            tn = tn.getRight();
        }
        return results;
    }

    public static void postOrderCru(TreeNode root) {
        if (null == root)
            return;
        postOrderCru(root.getLeft());
        postOrderCru(root.getRight());
        visit(root);
    }

    public static List<Integer> postOrderNormal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return results;
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root != null) {
                results.add(root.getValue());
                stack.push(root.getLeft());
                stack.push(root.getRight());
            }
        }
        Collections.reverse(results);
        return results;
    }

    public static void visit(TreeNode tn) {
        System.out.print(tn.getValue() + " ,");
    }
}

class BinaryTree {
    public BinaryTree() {
        mRoot = null;
    }

    private TreeNode mRoot;

    public TreeNode getRoot() {
        return mRoot;
    }

    public void setRoot(TreeNode mRoot) {
        this.mRoot = mRoot;
    }

    public void buildTree(BinaryTree bt, TreeNode tn, int data) {
        TreeNode tnT = new TreeNode(data);
        if (null == bt.getRoot()) {
            bt.setRoot(tnT);
        } else {
            if (data < tn.getValue()) {
                if (null == tn.getLeft()) {
                    tn.setLeft(tnT);
                } else {
                    buildTree(bt, tn.getLeft(), data);
                }
            } else {
                if (null == tn.getRight()) {
                    tn.setRight(tnT);
                } else {
                    buildTree(bt, tn.getRight(), data);
                }
            }
        }
    }

    public static void visit(TreeNode tn) {
        System.out.print(tn.getValue() + ", ");
    }

    public static void preOrderCru(TreeNode tn) {
        if (tn == null)
            return;
        visit(tn);
        preOrderCru(tn.getLeft());
        preOrderCru(tn.getRight());
    }

    public static List<Integer> preOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(tn);
        while (!stack.isEmpty()) {
            TreeNode tnT = stack.pop();
            if (null != tnT) {
                results.add(tnT.getValue());
                stack.push(tnT.getRight());
                stack.push(tnT.getLeft());
            }
        }

        return results;
    }

    public static void inOrderCru(TreeNode tn) {
        if (null == tn)
            return;
        inOrderCru(tn.getLeft());
        visit(tn);
        inOrderCru(tn.getRight());
    }

    public static List<Integer> inOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tnCur = tn;

        while (!(tnCur == null && stack.empty())) {
            while (tnCur != null) {
                stack.push(tnCur);
                tnCur = tnCur.getLeft();
            }
            tnCur = stack.pop();
            results.add(tnCur.getValue());
            tnCur = tnCur.getRight();
        }

        return results;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] results = {-1, -1};
        for(int i = 0; i < nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i]+nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                } else {
                    continue;
                }
            }
        }
        return results;
    }

    public static void postOrderCru(TreeNode tn) {
        if (null == tn)
            return;
        postOrderCru(tn.getLeft());
        postOrderCru(tn.getRight());
        visit(tn);
    }

    public static List<Integer> postOrderNormal(TreeNode tn) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (tn == null)
            return results;
        stack.push(tn);

        while (!stack.isEmpty()) {
            tn = stack.pop();
            if (null != tn) {
                results.add(tn.getValue());
                stack.push(tn.getLeft());
                stack.push(tn.getRight());
            }
        }
        Collections.reverse(results);
        return results;
    }
}

class TreeNode {
    private int      mValue;
    private TreeNode mLeft;
    private TreeNode mRight;

    public TreeNode(int value) {
        this.mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int mValue) {
        this.mValue = mValue;
    }

    public TreeNode getLeft() {
        return mLeft;
    }

    public void setLeft(TreeNode mLeft) {
        this.mLeft = mLeft;
    }

    public TreeNode getRight() {
        return mRight;
    }

    public void setRight(TreeNode mRight) {
        this.mRight = mRight;
    }

}

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {super(c);};
    public Iterable<T> reversed() {
        return new Iterable<T>() {

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {

                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}