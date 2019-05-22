package com.example.TheGym;

import java.util.ArrayList;
import java.util.List;

public class MembersList {

    public List<Member> members = new ArrayList<>();

    public MembersList() {
    }

    public MembersList(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}

