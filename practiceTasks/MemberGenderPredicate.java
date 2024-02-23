package practiceTasks;

public class MemberGenderPredicate implements MemberPredicate{
    @Override
    public boolean test(Member member) {
        return member.getGender().equals(Gender.MALE);
    }
}
