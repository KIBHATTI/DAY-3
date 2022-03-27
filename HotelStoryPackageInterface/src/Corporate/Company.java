package Corporate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Company {

    int branch;
     Branch brObj; //hasA

    public Company(int branch) {
        this.branch = branch;
        System.out.println("Company has branches "+branch);
       // Restaurant rsObj = new Restaurant(String resName);
    }

    void manageBranches()
    {
        System.out.println("company  manages branches \n"+brObj);
    }
}
