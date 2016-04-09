package ru.kos.ix.main;


/**
 * Created by Константин on 09.04.2016.
 */
public class ConcurentMain {
    /**
     * This is test main method. <br/>
     * It creates one client, connects to server and sends in parallel different requests to server. <br/>
     * The server must handle it in parallel and return every answer when it is ready. <br/>
     * Also client application must show answers in order of coming. (not sending)
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        OneClientThread oneClientThread = new OneClientThread();
        oneClientThread.start();
    }
}
