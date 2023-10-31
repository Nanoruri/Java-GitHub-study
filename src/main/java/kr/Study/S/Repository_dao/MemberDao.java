package kr.Study.S.Repository_dao;

import kr.Study.S.Member;


import java.util.List;

public interface MemberDao {
    public void save(Member member);

    public List<Member> findAll();
}
