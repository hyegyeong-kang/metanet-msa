package com.example.coffeemember.service;

import com.example.coffeemember.mapper.MemberMapper;
import com.example.coffeemember.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;

    public MemberVO findMember(MemberVO vo) {
        return memberMapper.existByMemberName(vo);
    }

    public int createMemberTable() {
        return memberMapper.createMemberTable();
    }

    public int insertMember() {
        return memberMapper.insertMemberData();
    }
}
