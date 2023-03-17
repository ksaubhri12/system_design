package proxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void create() {

    }

    @Override
    public void get() {

    }

    @Override
    public void delete() {

    }
}
