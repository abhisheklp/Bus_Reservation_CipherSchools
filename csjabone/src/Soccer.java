public class Soccer extends Sports{

    @Override
    String getName() {
        return "Soccer Class";
    }

    public static void main(String[] args) {

        Soccer s = new Soccer();
        s.getNoOfTeamMembers();

    }
}
