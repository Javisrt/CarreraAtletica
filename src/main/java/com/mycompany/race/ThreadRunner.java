package com.mycompany.race;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRunner extends Runner implements Runnable{
    AthleticRaceInterface hilo = new AthleticRaceInterface();
    Thread h;
    public ThreadRunner (String name) {
        super (name);
    }
    public ThreadRunner () {
        h = new Thread("hilo");
        h.start();
    }

    @Override
    public void run() {
        for(Runner i:hilo.corredores){
            try {
                Thread.sleep(1000*i.getSpeed());
                System.out.println(i.getName()+","+"tiempo: "+i.getSpeed());
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
