using JWT_Token.Models;

namespace JWT_Token.Services
{
    public interface IEmployeeService
    {
        Employee? GetEmployee(int id);

        IEnumerable<Employee> GetAllEmployee();
        Employee Add(Employee employee);
        Employee Update(Employee employeeChanges);
        Employee? Delete(int Id);
        IEnumerable<Department> GetAllDepartment();

    }

}
