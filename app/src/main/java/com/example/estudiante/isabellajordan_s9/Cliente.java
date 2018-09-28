package com.example.estudiante.isabellajordan_s9;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Cliente extends Thread{

    MainActivity activity;
    private  DatagramSocket socket;
boolean conectado;

    public Cliente(MainActivity activity){
        this.activity= activity;
        conectado=false;

    }

    //RECIBIIIIIIIIIIIIRRRRRRR

    @Override
    public void run() {

//conecta si está en el while
   while (true) {

       try {
           socket = new DatagramSocket();

       } catch (SocketException e) {
           e.printStackTrace();
       }
   }

    }


    public void enviarMensaje(final int pos){

        new Thread(new Runnable() {
            @Override
            public void run() {

                //enviar mensaje
                ByteArrayOutputStream baos= new ByteArrayOutputStream();
                DataOutputStream salida= new DataOutputStream(baos);

            }
        }).start();



    }



}
