
package acme.features.anonymous.tool;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.tools.Tool;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousToolRepository extends AbstractRepository {

	@Query("select i from Tool i where i.id = ?1")
	Tool findOneById(int id);

	@Query("select i from Tool i")
	Collection<Tool> findManyAll();

}
