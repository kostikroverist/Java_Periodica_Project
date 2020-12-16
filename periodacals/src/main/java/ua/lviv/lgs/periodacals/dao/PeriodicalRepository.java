package ua.lviv.lgs.periodacals.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ua.lviv.lgs.periodacals.domain.Periodical;
@EnableJpaRepositories
@Repository

public interface PeriodicalRepository extends JpaRepository<Periodical,Integer> {
}
