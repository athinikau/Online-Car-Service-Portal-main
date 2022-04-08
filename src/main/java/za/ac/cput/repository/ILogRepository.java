package za.ac.cput.repository;

import za.ac.cput.Entity.Log;

import java.util.Set;

public interface ILogRepository extends IRepository<Log, String> {
    public Set<Log> getall();

}
