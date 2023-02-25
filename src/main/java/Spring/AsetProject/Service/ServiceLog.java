package Spring.AsetProject.Service;


import Spring.AsetProject.Entities.Department;
import Spring.AsetProject.Entities.Employers;
import Spring.AsetProject.Entities.Position;
import Spring.AsetProject.Entities.Ranks;

import java.util.List;

//строим логику приложения(что наше приложение будет делать
//абстракция (говорит о поведений)
public interface ServiceLog {

    Employers addEmployer(Employers employers);
    Employers getEmployer(Long id);
    List<Employers> getAllEmployers();

    Employers updateEmployer(Employers employers);
    void deleteEmployer(Employers employers);






    Department addDepartment(Department department);
    Department getDepartment(Long id);
    List<Department> getAllDepartments();

    Department updateDepartment(Department department);
    void deleteDepartment(Department department);



    Position addPosition(Position position);
    Position getPosition(Long id);
    List<Position> getAllPosition();

    Position updatePosition(Position position);
    void deletePosition(Position position);



    Ranks addRanks(Ranks ranks);
    Ranks getRanks(Long id);
    List<Ranks> getAllRanks();

    Ranks updateRanks(Ranks ranks);
    void deleteRanks(Ranks ranks);

}
