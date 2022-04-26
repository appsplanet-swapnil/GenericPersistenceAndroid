package in.persistence.generic;

public interface GenericRepository {
    long insert();
    long update();
    void delete();
    Object query();
}
