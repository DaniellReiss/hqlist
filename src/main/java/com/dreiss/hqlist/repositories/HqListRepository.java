package com.dreiss.hqlist.repositories;

import com.dreiss.hqlist.entities.HqList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface HqListRepository extends JpaRepository<HqList, Long> {

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND hq_id = :hqId")
    void updateBelongingPosition(Long listId, Long hqId, Integer newPosition);

}
