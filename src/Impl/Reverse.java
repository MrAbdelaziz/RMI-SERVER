package Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import operation.ReverseInterface;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {

    public Reverse() throws RemoteException {
    }
    //EMSI -> ISME
    public String reverseString(String ChaineOrigine) { 
        StringBuffer temp = new StringBuffer(ChaineOrigine);
        return temp.reverse().toString();
    }
}
