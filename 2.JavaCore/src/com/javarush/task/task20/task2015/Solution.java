package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
Обязательно к  прочтению
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
*/
public class Solution implements Serializable, Runnable{
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public Solution(){}

    private void threadStart()
    {
        this.runner = new Thread(this);
        this.runner.start();
    }

    @Override
    public void run() {
        // do something here, doesn't matter what
        System.out.println(++ this.speed );
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(this);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.readObject();
        threadStart();
//        this.runner = new Thread((Solution) in.readObject());
//        this.runner.start();
    }

    public static void main(String[] args) throws  IOException, ClassNotFoundException{
        File file = File.createTempFile("task.task20.task2015", null);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Solution solution = new Solution(0);

        solution.writeObject(objectOutputStream);
        solution.readObject(objectInputStream);
        objectOutputStream.close();
        objectInputStream.close();

    }
}
