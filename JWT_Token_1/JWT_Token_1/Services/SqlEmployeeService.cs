using JWT_Token.Models;
using JWT_Token.Repository;
using Microsoft.EntityFrameworkCore;

namespace JWT_Token.Services
{
    public class SqlEmployeeServices : IEmployeeService
    {
        private readonly AppDbContext context;
        public SqlEmployeeServices(AppDbContext context)
        {
            this.context = context;
        }
        public Employee Add(Employee employee)
        {
            context.Employees.Add(employee);
            context.SaveChanges();
            return employee;
        }

        public Employee? Delete(int Id)
        {
            Employee? employee = context.Employees.Find(Id);
            if (employee != null)
            {
                context.Employees.Remove(employee);
                context.SaveChanges();
            }
            return employee;
        }

        public IEnumerable<Department> GetAllDepartment()
        {
            return context.Departments;
        }

        public IEnumerable<Employee> GetAllEmployee()
        {
            return context.Employees.Include(dpt => dpt.Department).ToList();
        }

        public Employee? GetEmployee(int id)
        {
            return context.Employees.FirstOrDefault(m => id == m.Id);
            //return e;
        }

        public Employee Update(Employee employeeChanges)
        {
            Employee? e = context.Employees.FirstOrDefault(m => m.Id == employeeChanges.Id);
            context.Entry(e).State = EntityState.Detached;
            context.Update(employeeChanges);
            context.SaveChanges();
            return employeeChanges;
        }
    }
}
