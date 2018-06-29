package com.thymeleafexample.thymeleafdemo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepository {


    public List<Messages> findAll(){
        Messages messages = new Messages();
        messages.setId("11");
        messages.setMsg("Eleven");

        List<Messages> messagesList = new ArrayList<>();
        messagesList.add(messages);

        return  messagesList;
    }


}
