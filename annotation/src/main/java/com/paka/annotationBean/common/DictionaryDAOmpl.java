package com.paka.annotationBean.common;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryDAOmpl implements DictionaryDAO {
    private Map<Integer, DictionaryDTO> dictionaryList;

    public DictionaryDAOmpl() {
        dictionaryList = new HashMap<>();
        dictionaryList.put(1, new DictionaryDTO(1, "Korean", "인생", "사람이 태어나 이 세상을 살아가는 일"));
        dictionaryList.put(2, new DictionaryDTO(2, "Korean", "요소", "사물의 성립·효력의 발생을 위하여 꼭 있어야 할 성분이나 조건"));

    }

    @Override
    public List<DictionaryDTO> selectDictionaryList() {
        return new ArrayList<>(dictionaryList.values());
    }


}

