package homework.oop_homework;

import lombok.ToString;

@ToString
public class Customer {

    public String name;
    public boolean member;
    public String memberType;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}
