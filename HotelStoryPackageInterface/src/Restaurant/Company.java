package Restaurant;

public class Company {

    int branch;
     Branch brObj; //hasA
    public Company(){}

    public Company(int branch) {
        this.branch = branch;
        System.out.println("Company has branches "+branch);
       // Restaurant rsObj = new Restaurant(String resName);
    }

    public void manageBranches()
    {
        System.out.println("company  manages branches \n");
    }
}
