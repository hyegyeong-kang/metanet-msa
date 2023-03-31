package com.example.coffeemember.mapper;

import com.example.coffeemember.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberVO existByMemberName(MemberVO vo);
    int createMemberTable();
    int insertMemberData();
}
