package ZCW.Api.Practice.Hearthstone.repositories;

import ZCW.Api.Practice.Hearthstone.models.HearthCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<HearthCard, Long> {}

