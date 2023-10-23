package kr.Study.S.dao;

import kr.Study.S.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberDao {
    public void save(Member member);

    public List<Member> findAll();
}
