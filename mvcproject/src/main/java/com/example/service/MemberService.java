package com.example.service;
 
import java.util.List;
 
import com.example.vo.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}