package com.dreiss.hqlist.services;

import com.dreiss.hqlist.dto.HqListDTO;
import com.dreiss.hqlist.entities.HqList;
import com.dreiss.hqlist.projections.HqMinProjection;
import com.dreiss.hqlist.repositories.HqListRepository;
import com.dreiss.hqlist.repositories.HqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HqListService {

    @Autowired
    private HqListRepository hqListRepository;

    @Autowired
    private HqRepository hqRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<HqListDTO> findAll() {
        List<HqList> result = hqListRepository.findAll();
        return result.stream().map(x -> new HqListDTO(x)).toList();


    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<HqMinProjection> list = hqRepository.searchByList(listId);

        HqMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            hqListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }


    }


}
