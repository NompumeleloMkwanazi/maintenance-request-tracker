/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mpumi
 */
public class Request {
    
    private int id;
    private String description;
    
    public Request(int id, String description){
        this.id = id;
        this.description = description;
    }
    
    public int getId(){
    return id;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public String toString(){
    return "Request #" + id + ":" + description;
    }
    
    }
    
