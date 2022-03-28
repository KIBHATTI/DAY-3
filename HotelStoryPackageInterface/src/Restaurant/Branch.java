package Restaurant;

public class Branch {
        static int branchno;
        int n;
        int Branch(int n)
        {
            this.n = n;
            for(int i=1;i<=n;i++)
            {
                System.out.println();
                System.out.println("number of branches are "+i);
            }

            return n;
        }
}
