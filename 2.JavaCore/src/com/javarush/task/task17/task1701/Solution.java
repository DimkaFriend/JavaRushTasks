package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread {
        @Override
        public void run() {
           for(int index = 0; index <=999;++index)
           {   //System.out.println(index+1);

               try {
                   Note.addNote(getName() + "-Note" + index);
                   Thread.sleep(1);
                   Note.removeNote(getName());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

        }
    }

    public static class Note
    {
        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note)
        {
        notes.add(0, note);
        }

        public static void removeNote(String threadName) {
        String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }


}

/*
* int i =0;
            while (true)
            {
                if(i<1000)
                {
                    try {
                        addNote(getName()+"-Note"+i);
                        Thread.sleep(1);
                        removeNote(getName());
                    }catch (InterruptedException e)
                    {
                        return;
                    }
                    i++;
                }else
                    {
                        return;
                    }
            }*/
