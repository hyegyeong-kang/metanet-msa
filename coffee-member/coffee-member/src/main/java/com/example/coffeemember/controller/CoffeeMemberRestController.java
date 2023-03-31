package com.example.coffeemember.controller;

import com.example.coffeemember.service.MemberService;
import com.example.coffeemember.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-member")
public class CoffeeMemberRestController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String coffeeMember() {
        return "coffee-member Service";
    }

    @GetMapping("/existMember/{memberName}")
    public boolean existMember(@PathVariable("memberName") String memberName){
        MemberVO vo = new MemberVO();
        vo.setMemberName(memberName);

        if(memberService.findMember(vo) != null){
            return true;
        }else {
            return false;
        }
    }

    @GetMapping("/createMemberTable")
    public void createMemberTable() {
        memberService.createMemberTable();
    }

    @GetMapping("/insertMember")
    public void insertMember() {
        memberService.insertMember();
    }
}
