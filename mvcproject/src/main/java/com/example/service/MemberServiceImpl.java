package com.example.service;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.example.dao.MemberDAO;
import com.example.vo.MemberVO;

/*
 * Service도 DAO와 마찬가지로 빈 등록을 해야 한다.
 * root-context.xml에 코드를 추가한다.
 */

@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
 
}