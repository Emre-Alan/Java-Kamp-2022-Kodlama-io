public class OracleCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Oracle veri tabanına eklendi.");
    }
}
