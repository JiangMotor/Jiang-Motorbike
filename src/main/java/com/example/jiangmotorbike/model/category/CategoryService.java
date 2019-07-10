package com.example.jiangmotorbike.model.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class CategoryService {
    @Autowired 
    CategoryRest category;

    public Iterable<Category> findAll(){
        return category.findAll();
    }

    public boolean addCategory(Category from){
        try{
            Category y = new Category();
            y.setCategory_name(from.getCategory_name());


            System.out.println(y);
            category.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateCategory(Category from){
        try{
           var y = category.findById(from.getId()).get();
           y.setCategory_name(from.getCategory_name());
           
            category.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delCategory(int id){
           try{
            category.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}