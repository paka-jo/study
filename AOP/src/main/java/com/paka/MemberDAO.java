package com.paka;

import javax.xml.stream.events.XMLEvent;
import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(12L,"돼지"));
        memberMap.put(2L, new MemberDTO(23L,"늑대"));

    }

    public Map<Long, MemberDTO> getMemberMap() {
        return memberMap;
    }

    public MemberDTO selectMember(Long id) {
        MemberDTO returnMember = memberMap.get(id);

        if (returnMember == null) {
            throw new RuntimeException("해당하는 ID의 회원이 없습니다");
        }
        return returnMember;
    }