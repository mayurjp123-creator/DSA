using JWT_Token.Models;
using JWT_Token.Services;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace JWT_Token.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeeController : ControllerBase
    {
        IEmployeeService employeeservice;

        public EmployeeController(IEmployeeService employeeservice)
        {
            this.employeeservice = employeeservice;
        }

        
        [HttpGet]
        [Authorize]
        public IEnumerable<Employee> Get()
        {
            return employeeservice.GetAllEmployee();
        }

        [HttpGet("{id}")]
        public Employee? Get(int Id)
        {
            return employeeservice.GetEmployee(Id);
        }

        [HttpPost]
        public ActionResult Post([FromBody] Employee emp)
        {
            employeeservice.Add(emp);
            return CreatedAtAction("Get", new { id = emp.Id }, emp);
        }

        [HttpPut("{id}")]
        public void Put(int id, Employee emp)
        {

            if (id != emp.Id)
            { }
            Employee? e = employeeservice.GetEmployee(id);
            if (e != null)
            {
                employeeservice.Update(emp);
            }

        }

        [HttpDelete("{id}")]
        public void Delete(int id)
        {
            Employee? e = employeeservice.GetEmployee(id);
            if (e != null)
            {
                employeeservice.Delete(id);
            }
        }
    }
}
