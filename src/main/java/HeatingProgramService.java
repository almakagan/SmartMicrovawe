@Service
public class HeatingProgramService {
    private final HeatingProgramRepository repository;

    public HeatingProgramService(HeatingProgramRepository repository) {
        this.repository = repository;
    }

    public HeatingProgram addProgram(HeatingProgram program) {
        return repository.save(program);
    }

    public List<HeatingProgram> getAllPrograms() {
        return repository.findAll();
    }

    public HeatingProgram updateProgram(Long id, HeatingProgram updatedProgram) {
        HeatingProgram program = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Программа не найдена"));
        program.setName(updatedProgram.getName());
        program.setPower(updatedProgram.getPower());
        program.setDuration(updatedProgram.getDuration());
        return repository.save(program);
    }
}
