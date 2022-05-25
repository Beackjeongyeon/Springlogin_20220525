package com.its.member.repository;

import com.its.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class MemberRepository {
  @Autowired
  private SqlSessionTemplate sql;

    public int save1(MemberDTO memberDTO) {
     return sql.insert("member.save1",memberDTO);
    }

    public MemberDTO login1(MemberDTO memberDTO) {
      return sql.selectOne("member.login1",memberDTO);
    }
}
