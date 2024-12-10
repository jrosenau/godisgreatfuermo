package org.example.godisgreat.repository;

import org.example.godisgreat.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClassRepository extends JpaRepository<Class, Integer> {

    @Query(value = "select * from Class c where c.id between :minId and :maxId", nativeQuery = true)
    public Class getClassWhereIdBetween(@Param("minId") int minId, @Param("maxId") int maxId);
}
