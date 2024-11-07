package in.codetech.angulareducloude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloude.module.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
