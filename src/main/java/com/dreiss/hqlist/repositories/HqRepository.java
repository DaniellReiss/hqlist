package com.dreiss.hqlist.repositories;

import com.dreiss.hqlist.entities.DC;
import com.dreiss.hqlist.projections.HqMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HqRepository extends JpaRepository<DC, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_dc.id, tb_dc.title, tb_dc.genre, tb_dc.img_url AS imgUrl,
            tb_dc.score, tb_belonging.position
            FROM tb_dc
            INNER JOIN tb_belonging ON tb_dc.id = tb_belonging.hq_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.position
			""")
    List<HqMinProjection> searchByList(Long listId);
}
