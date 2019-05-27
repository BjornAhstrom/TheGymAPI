package com.example.TheGym;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Members {

    GymInformation gymInfo = new GymInformation();
    ObjectMapper mapper = new ObjectMapper();

    public Members() {
       readFromFile();
    }

    public List<Member> getMembers(String searchString) {
        if (searchString.equals(""))
            return gymInfo.members;

        ArrayList<Member> members = new ArrayList<>();

        for (Member member : members) {
            if (member.getUserName().toLowerCase().contains(searchString.toLowerCase()))
                members.add(member);
        }
        return members;
    }

    public void addMember(Member member) {
        this.gymInfo.members.add(member);
        writeToFile();
    }

    public Member getMemberById(String id) {

        return findMemberById(id);
    }

    public Member deleteMember(String memberId) {
        Member member = findMemberById(memberId);
        gymInfo.members.remove(member);
        writeToFile();
        return member;
    }

    public void replaceMemberWithId(String memberId, Member newMember) {

        Member oldmember = findMemberById(memberId);
        gymInfo.members.remove(oldmember);
        newMember.setId(oldmember.getId());
        gymInfo.members.add(newMember);
        writeToFile();
    }

    private Member findMemberById(String id) {
        for (Member member : gymInfo.members) {
            if (member.getId().equals(id))
                return member;
        }
        return null;
    }

    private void writeToFile() {
        try {
            // Java object to json file
            mapper.writeValue(new File("members.json"), gymInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            String resourceMembers = "members.json";
            InputStream fileStream = new FileInputStream(resourceMembers);
            GymInformation membersList =  mapper.readValue(fileStream, GymInformation.class);

            gymInfo = membersList;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

