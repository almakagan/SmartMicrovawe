@Entity
public class HeatingProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int power; // Вт
    private int duration; // В секундах

    // Getters и Setters
}
