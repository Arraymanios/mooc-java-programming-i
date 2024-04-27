/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */

import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService(){
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message){
        if(message.getContent().length() > 280){
            System.out.println("This message is too long.");
            return;
        }
        this.messages.add(message);
    }
    
    public ArrayList<Message> getMessages(){
        ArrayList<Message> list = new ArrayList<>();
        for(Message message: this.messages){
            list.add(message);
        }
        return list;
    }
}
