package com.restaurantapp.RestaurantApp.WebSocketMessage;

//Deze class is een testclass voor websockets
public class MessageModel {
    private String from;
    private String text;

    public String getFrom() {
        return from;
    }

    public String getText(){
        return text;
    }

    public MessageModel(String _from, String _text){
        from = _from;
        text = _text;
    }
}
