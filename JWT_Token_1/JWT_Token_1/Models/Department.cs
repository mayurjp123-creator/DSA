namespace JWT_Token.Models
{
    public class Department
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public ICollection<Employee>? emps { get; set; }
    }
}
