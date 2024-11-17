@Repository
public interface HeatingProgramRepository extends JpaRepository<HeatingProgram, Long> {
    Optional<HeatingProgram> findByName(String name);
}
