package com.example.TheGym;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gym")
public class MemberController {

    private Members members = new Members();

    @RequestMapping(value = "/gymInfo", method = RequestMethod.GET)
    public List<Member> getMember(@RequestParam(value = "searchString", defaultValue = "") String searchString) {
        return members.getMembers(searchString);
    }

    @RequestMapping(value = "/gymInfo", method = RequestMethod.POST)
    public Member postMember(@RequestBody Member member) {
        members.addMember(member);
        return member;
    }

    @RequestMapping(value = "/gymInfo/{id}", method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") String memberId) {

        Member member = members.getMemberById(memberId);
        return member;
    }

    @RequestMapping(value = "/gymInfo/{id}", method = RequestMethod.DELETE)  //delete, get, patch, put
    public Member deleteMember(@PathVariable("id") String memberId) {

        return members.deleteMember(memberId);
    }

    @RequestMapping(value = "/gymInfo/{id}", method = RequestMethod.PUT)
    public Member putMember(@PathVariable("id") String memberId, @RequestBody Member member) {

        members.replaceMemberWithId(memberId, member);
        return member;
    }
}
