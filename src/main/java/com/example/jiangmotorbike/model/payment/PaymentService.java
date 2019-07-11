package com.example.jiangmotorbike.model.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PaymentService {
    @Autowired 
    PaymentRest payment;

    public Iterable<Payment> findAll(){
        return payment.findAll();
    }

    public boolean addPayment(Payment from){
        try{
            Payment y = new Payment();
            y.setPayment_link(from.getPayment_link());
            y.setProduct(from.getProduct());
            y.setProduct_name(from.getProduct_name());

            System.out.println(y);
            payment.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePayment(Payment from){
        try{
           var y = payment.findById(from.getId()).get();
           y.setPayment_link(from.getPayment_link());
           y.setProduct(from.getProduct());
           y.setProduct_name(from.getProduct_name());
   
            payment.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPayment(int id){
           try{
            payment.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}