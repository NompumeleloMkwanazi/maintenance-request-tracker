/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mpumi
 */
public class Main {
    
    public static void main(String[] args){
    ArrayList<Request> requests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int nextId = 1;
    boolean running = true;
          
            while(running){
            System.out.println("\n1. Add  request");
            System.out.println("2.List requests");
            System.out.println("3.Exit");
            System.out.println("Choose an option:");
            String choice = scanner.nextLine();
            
            switch (choice){
                case "1":
                    System.out.println("Describe the issue:");
                    String description = scanner.nextLine();
                    requests.add(new Request(nextId, description));
                    nextId++;
                    System.out.println("Request added.");
                    break;
                    
                case "2":
                    if (requests.isEmpty()){
                        System.out.println("No Requests yet.");
                    }
                    else
                    {
                       for (Request r: requests){
                       System.out.println(r);
                       }
                    }
                break;
                
                case "3":
                    running = false;
                    break;
                    
            }}
            }
            }
            
            
        
    
    
