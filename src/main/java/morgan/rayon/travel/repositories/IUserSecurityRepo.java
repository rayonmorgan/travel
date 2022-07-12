package morgan.rayon.travel.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import morgan.rayon.travel.entities.UserSecurity;

@Repository
public interface IUserSecurityRepo extends JpaRepository<UserSecurity, Integer> {
	Optional<UserSecurity> findUserByUsername(String username);
}
