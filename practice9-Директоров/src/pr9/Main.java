package pr9;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> client=new HashMap<String, Integer>();
        client.put("Jonny",123456789);
        client.put("Stephen",987654321);
        try {
            func(client,123456789,"Jonny");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            func(client,97531,"Stephen");
        } catch (NoSuchElementException  e) {
            System.out.println(e);
        }
    }
    static void func(Map<String,Integer> client, int inn, String name){
        int new_inn=client.get(name);
        if(inn!=(new_inn)){
            throw new NoSuchElementException("Неверный ИНН");
        }
        else{
            System.out.println("Всё верно");
        }
    }
}