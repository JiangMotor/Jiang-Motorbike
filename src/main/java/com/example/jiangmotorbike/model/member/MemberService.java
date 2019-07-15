package com.example.jiangmotorbike.model.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.var;

@Service
public class MemberService {
    @Autowired 
    MemberRest member;

    public Iterable<Member> findAll(){
        return member.findAll();
    }
    
    
    public boolean addMember(Member from){
        try{
            Member y = new Member();
            y.setMember_id(from.getMember_id());
            y.setMember_name(from.getMember_name());
            y.setPosition(from.getPosition());
            y.setBranch(from.getBranch());
            

            System.out.println(y);
            member.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateMember(Member from){
        try{
           var y = member.findById(from.getId()).get();
           y.setMember_id(from.getMember_id());
            y.setMember_name(from.getMember_name());
            y.setPosition(from.getPosition());
            y.setBranch(from.getBranch());

            member.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delMember(int id){
           try{
            member.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}