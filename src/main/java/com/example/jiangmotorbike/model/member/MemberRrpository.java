package com.example.jiangmotorbike.model.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MemberRrpository extends JpaRepository<Member, Long> {

    @Query(value = "SELECT * FROM member where member_id = :memId",nativeQuery = true)
        java.util.List<Member> findByMenberId(String memId);
    }
