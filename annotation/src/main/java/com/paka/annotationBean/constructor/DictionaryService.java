package com.paka.annotationBean.constructor;

import com.paka.annotationBean.common.DictionaryDAO;
import com.paka.annotationBean.common.DictionaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("directoryServiceConstrucor")
public class DictionaryService {

    private final DictionaryDAO directoryDAO;

    @Autowired
    public DictionaryService(DictionaryDAO directoryDAO) {this.directoryDAO= directoryDAO;}

    public List<DictionaryDTO> selectAllDirectorys() {

        return directoryDAO.selectDictionaryList();
    }
}
