package kr.Study.S.dao;

import kr.Study.S.Member;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
public class MemberDaoImpl implements MemberDao{

    private final List<Member> members = new ArrayList<>();
    @PostConstruct
    public void init() {
        System.out.println("MemberDaoImpl.init");
    }


    public void save(Member member) {
        // 회원 정보를 리스트에 추가하는 메서드
        members.add(member);
    }
    public List<Member> findAll() {
        // 모든 회원 정보를 반환하는 메서드
        return members;
    }
}

