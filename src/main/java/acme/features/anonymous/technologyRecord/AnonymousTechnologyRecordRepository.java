
package acme.features.anonymous.technologyRecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.technologyRecords.TechnologyRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTechnologyRecordRepository extends AbstractRepository {

	@Query("select tr from TechnologyRecord tr where tr.id = ?1")
	TechnologyRecord findOneById(int id);

	@Query("select tr from TechnologyRecord tr GROUP BY tr.activitySector")
	Collection<TechnologyRecord> findManyAllGroupedByActivitySector();

	@Query("select tr from TechnologyRecord tr where tr.activitySector = ?1")
	Collection<TechnologyRecord> findManyAllByActivitySector(String activitySector);

	@Query("select tr from TechnologyRecord tr")
	Collection<TechnologyRecord> findManyAll();

}
