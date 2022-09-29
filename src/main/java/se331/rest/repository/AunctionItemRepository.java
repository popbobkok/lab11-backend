package se331.rest.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import se331.rest.entity.AunctionItem;

        import java.util.List;

public interface AunctionItemRepository extends JpaRepository<AunctionItem,Long> {
    List<AunctionItem> findAll();
}

