package in.codetech.angulareducloude.porter.repoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloude.porter.module.User;

public interface repositoryInterface extends JpaRepository<User, Long>{

}
