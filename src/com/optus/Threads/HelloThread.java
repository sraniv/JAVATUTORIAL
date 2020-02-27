package com.optus.Threads;

/*
ubclass Thread. The Thread class itself implements Runnable, though its run method does nothing.
 An application can subclass Thread, providing its own implementation of run, as in the HelloThread example:

 Notice that both examples invoke Thread.start in order to start the new thread.

Which of these idioms should you use? The first idiom, which employs a Runnable object, is more general, because the
Runnable object can subclass a class other than Thread. The second idiom is easier to use in simple applications, but is
limited by the fact that your task class must be a descendant of Thread. This lesson focuses on the first approach, which
separates the Runnable task from the Thread object that executes the task. Not only is this approach more flexible, but it
is applicable to the high-level thread management APIs covered later.

The Thread class defines a number of methods useful for thread management. These include static methods, which provide
information about, or affect the status of, the thread invoking the method. The other methods are invoked from other
threads involved in managing the thread and Thread object. We'll examine some of these methods in the following sections.
 */

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}
