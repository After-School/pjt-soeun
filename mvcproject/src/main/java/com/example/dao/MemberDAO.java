package com.example.dao;
 
import java.util.List;
 
import com.example.vo.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}
