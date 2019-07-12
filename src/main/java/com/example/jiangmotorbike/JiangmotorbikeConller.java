package com.example.jiangmotorbike;


import com.example.jiangmotorbike.model.branch.Branch;
import com.example.jiangmotorbike.model.branch.BranchService;
import com.example.jiangmotorbike.model.category.Category;
import com.example.jiangmotorbike.model.category.CategoryService;
import com.example.jiangmotorbike.model.member.Member;
import com.example.jiangmotorbike.model.member.MemberService;
import com.example.jiangmotorbike.model.payment.Payment;
import com.example.jiangmotorbike.model.payment.PaymentService;
import com.example.jiangmotorbike.model.position.Position;
import com.example.jiangmotorbike.model.position.PositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JiangmotorbikeConller {

    
    @Autowired
    private CategoryService category;

    @GetMapping(value = "/Category")
    public Iterable<Category> category() {
        return category.findAll();
    }
    @PostMapping(value="/addCategory")
    public ResponseEntity<Boolean> addCategory(@RequestBody Category model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(category.addCategory(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateCategory")
    public ResponseEntity<Boolean> updateCategory(@RequestBody Category model){
        return new ResponseEntity<Boolean>(category.updateCategory(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delCategory/{id}")
    public ResponseEntity<Boolean> delCategory(@PathVariable int id){
        return new ResponseEntity<Boolean>(category.delCategory(id),HttpStatus.OK);
    } 
    
    @Autowired
    private MemberService member;

    @GetMapping(value = "/Member")
    public Iterable<Member> member() {
        return member.findAll();
    }
    @PostMapping(value="/addMember")
    public ResponseEntity<Boolean> addMember(@RequestBody Member model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(member.addMember(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateMember")
    public ResponseEntity<Boolean> updateMember(@RequestBody Member model){
        return new ResponseEntity<Boolean>(member.updateMember(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delMember/{id}")
    public ResponseEntity<Boolean> delMember(@PathVariable int id){
        return new ResponseEntity<Boolean>(member.delMember(id),HttpStatus.OK);
    } 

    

    @Autowired
    private PaymentService payment;

    @GetMapping(value = "/Payment")
    public Iterable<Payment> payment() {
        return payment.findAll();
    }
    @PostMapping(value="/addPayment")
    public ResponseEntity<Boolean> addPayment(@RequestBody Payment model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(payment.addPayment(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePayment")
    public ResponseEntity<Boolean> updatePayment(@RequestBody Payment model){
        return new ResponseEntity<Boolean>(payment.updatePayment(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPayment/{id}")
    public ResponseEntity<Boolean> delPayment(@PathVariable int id){
        return new ResponseEntity<Boolean>(payment.delPayment(id),HttpStatus.OK);
    } 

    @Autowired
    private PositionService position;

    @GetMapping(value = "/Position")
    public Iterable<Position> datasuzuki() {
        return position.findAll();
    }
    @PostMapping(value="/addPosition")
    public ResponseEntity<Boolean> addPosition(@RequestBody Position model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(position.addPosition(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePosition")
    public ResponseEntity<Boolean> updateDatasuzuki(@RequestBody Position model){
        return new ResponseEntity<Boolean>(position.updatePosition(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPosition/{id}")
    public ResponseEntity<Boolean> delPosition(@PathVariable int id){
        return new ResponseEntity<Boolean>(position.delPosition(id),HttpStatus.OK);
    } 

    @Autowired
    private BranchService branch;

    @GetMapping(value = "/Branch")
    public Iterable<Branch> branch() {
        return branch.findAll();
    }
    @PostMapping(value="/addBranch")
    public ResponseEntity<Boolean> addBranch(@RequestBody Branch model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(branch.addBranch(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateBranch")
    public ResponseEntity<Boolean> updateBranch(@RequestBody Branch model){
        return new ResponseEntity<Boolean>(branch.updateBranch(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delBranch/{id}")
    public ResponseEntity<Boolean> delBranch(@PathVariable int id){
        return new ResponseEntity<Boolean>(branch.delBranch(id),HttpStatus.OK);
    } 
}
