package ua.lviv.lgs.periodacals.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.periodacals.domain.Periodical;

public interface PeriodicalRepository extends JpaRepository<Periodical,Integer> {
}
