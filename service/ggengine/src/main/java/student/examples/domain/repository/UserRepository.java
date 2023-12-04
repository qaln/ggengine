package student.examples.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import student.examples.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<UUID, User> {

	@Query("SELECT u FROM clients u WHERE u.username = :userName AND u.password_hash = :hashedPassword")
	User findByUsernameAndHashedPassword(@Param("userName") String userName,
			@Param("hashedPassword") String hashedPassword);
	

	@Query("SELECT u FROM clients u WHERE u.username = :userName")
	User findByUsername(@Param("userName") String userName);
	

}
