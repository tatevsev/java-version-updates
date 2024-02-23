package practiceTasks;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        /* WRONG SOLUTION
        //we are creating a list of members
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(Gender.MALE,23));
        memberList.add(new Member(Gender.MALE,22));
        memberList.add(new Member(Gender.FEMALE,20));
        memberList.add(new Member(Gender.MALE,12));

        //our function takes a list of members and check if gender condition qualifies then it adds to new list
        List<Member> genderQualified = qualifiedMember(memberList,new MemberGenderPredicate());
        System.out.println(genderQualified);

        //our function takes a list of members and check if age condition qualifies then it adds to new list
        List<Member> ageQualified = qualifiedMember(memberList,new MemberAgePredicate());
        System.out.println(ageQualified);

        System.out.println("=============LAMBDA==============");
        //LAMBDA, with LAMBDA we don't need anymore MemberAgePredicate or MemberGenderPredicate classes, we can use the function in one line
        MemberPredicate genderCheck = member -> member.getGender().equals(Gender.MALE);
        List<Member> gender = qualifiedMember(memberList,genderCheck);
        System.out.println(gender);

        MemberPredicate ageCheck = member -> member.getAge()>18 && member.getAge()<25;
        List<Member> age  = qualifiedMember(memberList,ageCheck);
        System.out.println(age);





    }

    private static List<Member> qualifiedMember (List<Member> memberList, MemberPredicate member){

        List<Member> qualifiedMember = new ArrayList<>();
        for (Member eachMember : memberList) {
            if(member.test(eachMember)){
                qualifiedMember.add(eachMember);
            }
        }
        return qualifiedMember;
    }

}
*/

/*
Suppose that you are creating a social networking application. You want to
create a feature that enables an administrator to perform any kind of action,
such as sending a message, on members of the social networking application
that satisfy certain criteria.

Criteria : Send message to Male Members whose age is between 18 and 25
*/
    }
}