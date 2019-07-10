package com.example.jiangmotorbike.model.position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PositionService {
    @Autowired 
    PositionRest position;

    public Iterable<Position> findAll(){
        return position.findAll();
    }

    public boolean addPosition(Position from){
        try{
            Position y = new Position();
            y.setPosition_name(from.getPosition_name());

            System.out.println(y);
            position.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePosition(Position from){
        try{
           var y = position.findById(from.getId()).get();
           y.setPosition_name(from.getPosition_name());
           
            position.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPosition(int id){
           try{
            position.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}