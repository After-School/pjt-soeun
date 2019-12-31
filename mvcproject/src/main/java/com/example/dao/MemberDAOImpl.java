package com.example.dao;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.example.vo.MemberVO;


/*
 * SqlSession을 주입받아서 memberMapper.xml 에 등록한 쿼리문을 실행한다.
 * 쿼리 실행 결과 여러 개의 데이터를 가져오게 되므로 List로 받아서 리턴한다.
 * @Repository 어노테이션이 설정되어있더라도 스프링에서 해당 패키지를 스캔하지 않으면 스링 빈으로 등록되지 않는다.
 * 그렇기에 root-context.xml 에 빈 등록을 해야 한다. 
 */

@Repository
public class MemberDAOImpl implements MemberDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.example.mapper.memberMapper";
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
 
}