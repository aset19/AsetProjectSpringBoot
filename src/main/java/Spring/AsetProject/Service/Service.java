package Spring.AsetProject.Service;


import Spring.AsetProject.Entities.Department;
import Spring.AsetProject.Entities.Employers;
import Spring.AsetProject.Entities.Position;
import Spring.AsetProject.Entities.Ranks;
import Spring.AsetProject.Repository.DepartmentRepo;
import Spring.AsetProject.Repository.EmployersRepo;
import Spring.AsetProject.Repository.PositionRepo;
import Spring.AsetProject.Repository.RanksRepo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@org.springframework.stereotype.Service
@Transactional
public class Service implements ServiceLog {

    private final EmployersRepo employersRepo;

    private final DepartmentRepo departmentRepo;

    private final PositionRepo positionRepo;

    private final RanksRepo ranksRepo;

    public Service(EmployersRepo employersRepo, DepartmentRepo departmentRepo, PositionRepo positionRepo, RanksRepo ranksRepo) {
        this.employersRepo = employersRepo;
        this.departmentRepo = departmentRepo;
        this.positionRepo = positionRepo;
        this.ranksRepo = ranksRepo;
    }



    @Override
    public Employers addEmployer(Employers employers) {
        return employersRepo.save(employers);
    }

    @Override
    public Employers getEmployer(Long id) {
        return employersRepo.getById(id);
    }

    @Override
    public List<Employers> getAllEmployers() {
        return employersRepo.findAll();
    }

    @Override
    public Employers updateEmployer(Employers employers) {
        return employersRepo.save(employers);
    }

    @Override
    public void deleteEmployer(Employers employers) {
        employersRepo.delete(employers);
    }




///////////////////////////////////////////////////////////////////////////////////
    @Override
    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department getDepartment(Long id) {
        return departmentRepo.getById(id);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentRepo.delete(department);
    }





//////////////////////////////////////////////////////////////////////////////////
    @Override
    public Position addPosition(Position position) {
        return positionRepo.save(position);
    }

    @Override
    public Position getPosition(Long id) {
        return positionRepo.getById(id);
    }

    @Override
    public List<Position> getAllPosition() {
        return positionRepo.findAll();
    }

    @Override
    public Position updatePosition(Position position) {
        return positionRepo.save(position);
    }

    @Override
    public void deletePosition(Position position) {
        positionRepo.delete(position);

    }



///////////////////////////////////////////////////////////////////////////////////
    @Override
    public Ranks addRanks(Ranks ranks) {
        return ranksRepo.save(ranks);
    }

    @Override
    public Ranks getRanks(Long id) {
        return ranksRepo.getById(id);
    }

    @Override
    public List<Ranks> getAllRanks() {
        return ranksRepo.findAll();
    }

    @Override
    public Ranks updateRanks(Ranks ranks){
        return ranksRepo.save(ranks);
    }

    @Override
    public void deleteRanks(Ranks ranks) {
        ranksRepo.delete(ranks);
    }
}
