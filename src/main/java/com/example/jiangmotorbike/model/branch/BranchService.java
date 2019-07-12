package com.example.jiangmotorbike.model.branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class BranchService {
    @Autowired 
    BranchRest branch;

    public Iterable<Branch> findAll(){
        return branch.findAll();
    }

    public boolean addBranch(Branch from){
        try{
            Branch y = new Branch();
            y.setBranch(from.getBranch());


            System.out.println(y);
            branch.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateBranch(Branch from){
        try{
           var y = branch.findById(from.getId()).get();
           y.setBranch(from.getBranch());
           
           branch.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delBranch(int id){
           try{
            branch.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}