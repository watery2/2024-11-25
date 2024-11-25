package kitm;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean isMember()
    {
        return member;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public void setMemberType(String memberType)
    {
        this.memberType = memberType;
    }

    public void setMember(boolean member)
    {
        this.member = member;
    }

    @Override
    public String toString()
    {
        return "name: "+ name + " member: " + member + " memberType: " + memberType;
    }
}
