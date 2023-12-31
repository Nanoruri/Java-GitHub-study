package me.JH.SpringStudy.RepositoryDao;

import me.JH.SpringStudy.Entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<User,String> {
//이러면 JPA 쓰는 의미가 있는가..

    //JPA는 메서드 이름을 기준으로  분석하여 쿼리를 자동으로 생성함. 그래서 엔티티 테이블과 매핑할 수 있는
    //엔티티 클래스가 필요한거라고 추즉 됨

    //
    User findByNameAndEmail(String name, String email);

    //찾기 서비스
    User findByUserIdAndNameAndEmail(String userId, String name, String email);


}
