package practiceTasks;

public class MemberAgePredicate implements MemberPredicate{
    @Override
    public boolean test(Member member) {
        return member.getAge() > 18 && member.getAge()<25;
    }
}
